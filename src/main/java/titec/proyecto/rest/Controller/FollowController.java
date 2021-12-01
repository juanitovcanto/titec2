package titec.proyecto.rest.Controller;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


import javax.ws.rs.Produces;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import titec.proyecto.rest.Model.EntitiesFollow.UsuarioFollow;
import titec.proyecto.rest.Service.FollowService;

@Path("/follow")
@Singleton
public class FollowController {
    @Inject
    private FollowService followService;
    @Context
    private UriInfo uriInfo;

    @POST
    @Path("/{id}")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Transactional
    public Response addUsuario(@PathParam("id") long id,long id_seguidor){
        Response.ResponseBuilder builder = null;
        try {
            // Store the contact
            followService.insert(id,id_seguidor);
            
            // Create an "ok" response with the persisted contact
            builder = Response.ok();
        } catch (Exception e) {
            // Handle generic exceptions
            builder = Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage());
        }

        return builder.build();
    }

}
