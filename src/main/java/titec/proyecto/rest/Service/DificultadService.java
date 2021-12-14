package titec.proyecto.rest.Service;

import java.util.List;

import javax.ejb.Local;

import titec.proyecto.rest.DTO.DificultadDTO;

@Local
public interface DificultadService {
  List<DificultadDTO> findAll();
  
}
