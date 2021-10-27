package titec.proyecto.rest.Service;

import java.util.List;
import javax.ejb.Local;
import titec.proyecto.rest.DTO.PaisDTO;

@Local
public interface PaisService {
  List<PaisDTO> findAll();
}
