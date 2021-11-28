package titec.proyecto.rest.Service.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import titec.proyecto.rest.Model.EntitiesFollow.UsuarioFollow;
import titec.proyecto.rest.Service.FollowService;

public class FollowServiceImpl implements FollowService{
    @Context
    UriInfo uriinfo;
    
    @Inject
    private EntityManager em;

    @Override
    public void insert( long id, long id_seguidor){
        UsuarioFollow usuarioSeguido = em.find(UsuarioFollow.class, id);
        usuarioSeguido.addUsuario(usuario);
        em.persist(usuarioSeguido);
    }

}
