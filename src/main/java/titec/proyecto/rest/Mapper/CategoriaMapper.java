package titec.proyecto.rest.Mapper;

import java.util.ArrayList;
import java.util.List;
import titec.proyecto.rest.DTO.CategoriaDTO;
import titec.proyecto.rest.Model.Categoria;


public class CategoriaMapper {
    public static List<CategoriaDTO> convertToDTO(List<Object> categoriaQuery){
        List<CategoriaDTO> listaCategoria = new ArrayList<>( categoriaQuery.size());
        
        for(Object cg:categoriaQuery){
            CategoriaDTO categoriaDTO = new CategoriaDTO();
            Categoria categoriaEntidad = (Categoria)cg;

            categoriaDTO.setId(categoriaEntidad.getId());
            categoriaDTO.setCategoria(categoriaEntidad.getCategoria());

            listaCategoria.add(categoriaDTO);
        }
        return listaCategoria;
    }
}
