package titec.proyecto.rest.Service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import titec.proyecto.rest.Model.ComentarioEntities.Comentario;
import titec.proyecto.rest.Service.ComentarioService;

@Stateless
public class ComentarioServiceImpl implements ComentarioService {

  @PersistenceContext
  private EntityManager em;

  @Override
  public void insertComentario(Comentario comentario){
    em.persist(comentario);
  }
  
}
