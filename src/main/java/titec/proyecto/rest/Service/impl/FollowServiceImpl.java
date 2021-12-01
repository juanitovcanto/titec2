package titec.proyecto.rest.Service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import titec.proyecto.rest.Model.FollowEntities.CreacionFollow.Follow;
import titec.proyecto.rest.Service.FollowService;

public class FollowServiceImpl implements FollowService{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Follow follow){
        em.persist(follow);
    }

}
