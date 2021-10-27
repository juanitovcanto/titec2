package titec.proyecto.rest.Controller;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.UriInfo;

import titec.proyecto.rest.DTO.PaisDTO;
import titec.proyecto.rest.Service.PaisService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Path("/paises")
@Singleton
public class PaisController {
  
  @Inject
  PaisService paisService;
  @Context
  private UriInfo uriInfo;
  
  @GET
  @Produces(APPLICATION_JSON)
  public List<PaisDTO> getAllPaises(){
    return paisService.findAll();
  }
}
