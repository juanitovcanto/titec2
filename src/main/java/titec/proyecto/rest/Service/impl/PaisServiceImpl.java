package titec.proyecto.rest.Service.impl;

import titec.proyecto.rest.Service.PaisService;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import titec.proyecto.rest.DTO.PaisDTO;
import titec.proyecto.rest.Mapper.PaisMapper;
import titec.proyecto.rest.Model.Paises;

public class PaisServiceImpl implements PaisService {
  @Context
  UriInfo uriInfo;
  
  @Override
  public List<PaisDTO> findAll(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "primary" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Paises> from = criteriaQuery.from(Paises.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        
        TypedQuery<Object> typedQuery = entitymanager.createQuery(select);

        List<Object> resultList = typedQuery.getResultList();

        List<PaisDTO> resultado = PaisMapper.convertToDTO(resultList);

        entitymanager.close( );
        emfactory.close( );

        return resultado;
  }
}
