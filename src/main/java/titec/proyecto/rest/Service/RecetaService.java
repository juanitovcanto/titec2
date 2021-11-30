package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.Model.RecetaEntities.CreacionReceta.Receta;

@Local
public interface RecetaService {
  
  void insertReceta(Receta receta);
  
}
