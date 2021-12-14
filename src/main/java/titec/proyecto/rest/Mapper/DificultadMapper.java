package titec.proyecto.rest.Mapper;

import java.util.ArrayList;
import java.util.List;

import titec.proyecto.rest.DTO.DificultadDTO;
import titec.proyecto.rest.Model.Dificultad;

public class DificultadMapper {
  public static List<DificultadDTO> convertToDTO(List<Dificultad> dificultadQuery){
    List<DificultadDTO> listaDificultad = new ArrayList<>(dificultadQuery.size());

    for(Dificultad dificultad : dificultadQuery){
      DificultadDTO dificultadDTO = new DificultadDTO();
      dificultadDTO.setId(dificultad.getId());
      dificultadDTO.setDificultad(dificultad.getDificultad());
      listaDificultad.add(dificultadDTO);
      
    }
    return listaDificultad;

  }
  
}
