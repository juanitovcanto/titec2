package titec.proyecto.rest.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.Model.RecetaEntities.CreacionReceta.Receta;
import titec.proyecto.rest.Service.RecetaService;

@Path("receta")
@RequestScoped
public class RecetaController {
  
  @Inject
  private RecetaService recetaService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response crearReceta(Receta receta){
    recetaService.insertReceta(receta);
    return Response.status(201).build();
  }
}
