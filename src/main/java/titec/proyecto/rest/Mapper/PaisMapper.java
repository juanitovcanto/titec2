package titec.proyecto.rest.Mapper;

import java.util.ArrayList;
import java.util.List;
import titec.proyecto.rest.DTO.PaisDTO;
import titec.proyecto.rest.Model.Paises;

public class PaisMapper {
  public static List<PaisDTO> convertToDTO(List<Object> paisQuery){
    List<PaisDTO> listaPaises = new ArrayList<>( paisQuery.size());

    for (Object ps:paisQuery){
      PaisDTO paisDTO = new PaisDTO();
      Paises paisEntidad = (Paises)ps;

      paisDTO.setId(paisEntidad.getId());
      paisDTO.setPais(paisEntidad.getPais());

      listaPaises.add(paisDTO);

    }
    return listaPaises;
  }
}
