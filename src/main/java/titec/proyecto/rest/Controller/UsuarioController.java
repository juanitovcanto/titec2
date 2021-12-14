package titec.proyecto.rest.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.DTO.QueryUsuarioDTO.UsuarioEspecificoDTO;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.UsuarioUpdate;
import titec.proyecto.rest.Service.UsuarioService;

@Path("/usuario")
@RequestScoped
public class UsuarioController {

  @Inject
  private UsuarioService usuarioService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public Response getUsuarioById(@PathParam("id") Long id){

    if (id == null){
      return Response.serverError().entity("El valor no puede estar vacio").build();
    }

    UsuarioEspecificoDTO usuarioEspecificoDTO = usuarioService.findById(id);
    if (usuarioEspecificoDTO == null){
      return Response.status(Response.Status.NOT_FOUND).entity("Error, usuario no encontrado").build();
    }
    return Response.ok(usuarioEspecificoDTO).build();

  }

 

  @DELETE
  @Path("/{id}")
  public Response borrarUsuario(@PathParam("id") Long id){

    usuarioService.removeUsuario(id);
    return Response.status(204).build();
    
  }
  @PUT
  public Response actualizarUsuario(UsuarioUpdate usuario){
    usuarioService.updateUsuario(usuario);
    return Response.status(204).build();
    
  }

}
