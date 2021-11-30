package titec.proyecto.rest.Service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import titec.proyecto.rest.Model.RecetaEntities.CreacionReceta.Receta;
import titec.proyecto.rest.Service.RecetaService;

@Stateless
public class RecetaServiceImpl implements RecetaService{

  @PersistenceContext
  private EntityManager em;

  @Override
  public void insertReceta(Receta receta){
    em.persist(receta);
  }
  
}
