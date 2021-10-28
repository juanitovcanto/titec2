package titec.proyecto.rest.Service;

import java.util.List;
import javax.ejb.Local;
import titec.proyecto.rest.DTO.CategoriaDTO;

@Local
public interface CategoriaService {
    List<CategoriaDTO> findAll();
}
