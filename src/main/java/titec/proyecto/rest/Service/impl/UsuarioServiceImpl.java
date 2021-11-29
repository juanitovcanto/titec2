package titec.proyecto.rest.Service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Service.UsuarioService;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

  @PersistenceContext
  private EntityManager em;

  @Override
  public Usuario findById(Long id){
  

    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
    Root<Usuario> from = criteriaQuery.from(Usuario.class);
    CriteriaQuery<Usuario> select = criteriaQuery.select(from);

    select.where(criteriaBuilder.equal(from.get("id"), id));
    TypedQuery<Usuario> typedQuery = em.createQuery(select);
    Usuario resultado = typedQuery.getSingleResult();
    
    return resultado;

    

  }
  
  @Override
  public void insertUsuario(Usuario usuario){
    em.persist(usuario);

    //em.persist(usuario.getPerfil());
  }

  @Override
  public void removeUsuario(Long id){
    

    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    CriteriaDelete<Usuario> criteriaDelete = criteriaBuilder.createCriteriaDelete(Usuario.class);
    Root<Usuario> from = criteriaDelete.from(Usuario.class);

    criteriaDelete.where(criteriaBuilder.equal(from.get("id"), id));
    em.createQuery(criteriaDelete).executeUpdate();

  }

  @Override
  public  void updateUsuario(Usuario usuario){

    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    CriteriaUpdate<Usuario> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Usuario.class);
    Root<Usuario> from = criteriaUpdate.from(Usuario.class);

    criteriaUpdate.set("nombre",usuario.getNombre());
    criteriaUpdate.set("apellido",usuario.getApellido());
    criteriaUpdate.where(criteriaBuilder.equal(from.get("id"), usuario.getId()));
    em.createQuery(criteriaUpdate).executeUpdate();

    

  }

}
