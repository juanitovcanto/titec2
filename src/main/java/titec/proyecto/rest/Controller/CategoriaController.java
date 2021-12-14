package titec.proyecto.rest.Controller;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import titec.proyecto.rest.DTO.CategoriaDTO;
import titec.proyecto.rest.Service.CategoriaService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Path("/categoria")
@Singleton
public class CategoriaController {
    
    @Inject
    CategoriaService categoriaService;


    @GET
    @Produces(APPLICATION_JSON)
    public List<CategoriaDTO> getAllCategorias(){
        return categoriaService.findAll();
    }
}
