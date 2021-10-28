package titec.proyecto.rest.Service.impl;

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

import titec.proyecto.rest.DTO.CategoriaDTO;
import titec.proyecto.rest.Mapper.CategoriaMapper;
import titec.proyecto.rest.Model.Categoria;
import titec.proyecto.rest.Service.CategoriaService;

public class CategoriaServiceImpl implements CategoriaService{
    @Context
    UriInfo uriInfo;
  
    @Override
    public List<CategoriaDTO> findAll(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "primary" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Categoria> from = criteriaQuery.from(Categoria.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        
        TypedQuery<Object> typedQuery = entitymanager.createQuery(select);

        List<Object> resultList = typedQuery.getResultList();

        List<CategoriaDTO> resultado = CategoriaMapper.convertToDTO(resultList);

        entitymanager.close( );
        emfactory.close( );

        return resultado;
    }
}
