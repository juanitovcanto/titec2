package titec.proyecto.rest.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.Model.LikeEntities.CreacionLikes.Likes;
import titec.proyecto.rest.Service.LikesService;

@Path("/like")
@RequestScoped
public class LikesController {
  @Inject
  private LikesService likesService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response addLike(Likes likes){
    Response.ResponseBuilder builder = null;
    try {
      likesService.insert(likes);

      builder = Response.ok();
    } catch (Exception e) {
      builder = Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage());
      //TODO: handle exception
    }
    return builder.build();
  }
  
}
