package titec.proyecto.rest.Controller;

import java.util.List;

import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.DTO.DificultadDTO;
import titec.proyecto.rest.Service.DificultadService;

@Path("/dificultad")
@Singleton
public class DificultadController {
  @Inject
  DificultadService dificultadService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getDificultad(){
    List<DificultadDTO> listaDificultad = dificultadService.findAll();
    if (listaDificultad.isEmpty()){
      return Response.status(Response.Status.NOT_FOUND).entity("no hay dificultad").build();
    }
    return Response.ok(listaDificultad).build();
  }
  
}
