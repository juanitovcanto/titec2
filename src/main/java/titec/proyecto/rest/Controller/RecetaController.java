package titec.proyecto.rest.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.DTO.QueryRecetaDTO.RecetaQueryDTO;
import titec.proyecto.rest.Model.RecetaEntities.CreacionReceta.Receta;
import titec.proyecto.rest.Service.RecetaService;

@Path("/receta")
@RequestScoped
public class RecetaController {
  
  @Inject
  private RecetaService recetaService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public Response getRecetaById(@PathParam("id") Long id){
    if (id == null){
      return Response.serverError().entity("El valor no puede estar vacio").build();
    }
    RecetaQueryDTO recetaQueryDTO = recetaService.findById(id);
    if (recetaQueryDTO == null){
      return Response.status(Response.Status.NOT_FOUND).entity("error,receta no encontrado").build();

    }
    return Response.ok(recetaQueryDTO).build();
  }


  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response crearReceta(Receta receta){
    recetaService.insertReceta(receta);
    return Response.status(201).build();
  }
}
