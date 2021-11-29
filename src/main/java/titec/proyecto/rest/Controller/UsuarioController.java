package titec.proyecto.rest.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Service.UsuarioService;

@Path("/usuario")
@RequestScoped
public class UsuarioController {

  @Inject
  private UsuarioService usuarioService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response crearUsuario(Usuario usuario){

    usuarioService.insertUsuario(usuario);
    return Response.status(201).build();

  }

  @DELETE
  @Path("/{id}")
  public Response borrarUsuario(@PathParam("id") Long id){

    usuarioService.removeUsuario(id);
    return Response.status(204).build();
    
  }
  @PUT
  public Response actualizarUsuario(Usuario usuario){
    usuarioService.updateUsuario(usuario);
    return Response.status(204).build();
    
  }

}
