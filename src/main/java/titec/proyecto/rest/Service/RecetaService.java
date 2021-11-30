package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.DTO.QueryRecetaDTO.RecetaQueryDTO;
import titec.proyecto.rest.Model.RecetaEntities.CreacionReceta.Receta;

@Local
public interface RecetaService {
  
  RecetaQueryDTO findById(Long Id);
  
  void insertReceta(Receta receta);
  
}
