package titec.proyecto.rest.Service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import titec.proyecto.rest.DTO.LoginDTO.UsuarioLoginDTO;
import titec.proyecto.rest.Mapper.LoginMapper;
import titec.proyecto.rest.Model.LoginEntities.UsuarioLogin;
import titec.proyecto.rest.Model.LoginEntities.UsuarioLogin_;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Service.LoginService;

@Stateless
public class LoginServiceImpl implements LoginService {
  @PersistenceContext
  private EntityManager em;

  @Override
  public void insertUsuario(Usuario usuario){
    em.persist(usuario);
  }

  @Override
  public UsuarioLoginDTO authenticate(final String username, final String password) throws Exception{

    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<UsuarioLogin> cq = cb.createQuery(UsuarioLogin.class);
    Root<UsuarioLogin> uRoot = cq.from(UsuarioLogin.class);
    CriteriaQuery<UsuarioLogin> uQuery = cq.select(uRoot);

    uQuery.where(cb.equal(uRoot.get(UsuarioLogin_.username), username));
    TypedQuery<UsuarioLogin> typedQuery = em.createQuery(uQuery);
    UsuarioLogin usuarioEntity = typedQuery.getSingleResult();

    
  
      if(usuarioEntity != null && usuarioEntity.getPassword().equals(password)){
        UsuarioLoginDTO usuarioDTO = LoginMapper.convertToDTO(usuarioEntity);

        return usuarioDTO;
      
    }
    throw new Exception("falla en la autentificacion'" + username + "': usuario desconocido o contrasena incorrecta");
  }

  
}
