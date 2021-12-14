package titec.proyecto.rest.Service.impl;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import titec.proyecto.rest.Model.LikeEntities.CreacionLikes.Likes;
import titec.proyecto.rest.Service.LikesService;

@Stateful
public class LikesServiceImpl implements LikesService{
  @PersistenceContext
  private EntityManager em;

  @Override
  public void insert(Likes likes){
    em.persist(likes);
  }
  
}
