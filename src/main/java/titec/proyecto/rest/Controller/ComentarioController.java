package titec.proyecto.rest.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.Model.ComentarioEntities.Comentario;
import titec.proyecto.rest.Service.ComentarioService;

@Path("/comentario")
@RequestScoped
public class ComentarioController {
  @Inject
  private ComentarioService comentarioService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response crearComentario(Comentario comentario){
    comentarioService.insertComentario(comentario);
    return Response.status(201).build();
  }
}
