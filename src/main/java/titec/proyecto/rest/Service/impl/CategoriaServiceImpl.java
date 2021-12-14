package titec.proyecto.rest.Service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import titec.proyecto.rest.DTO.CategoriaDTO;
import titec.proyecto.rest.Mapper.CategoriaMapper;
import titec.proyecto.rest.Model.Categoria;
import titec.proyecto.rest.Service.CategoriaService;

public class CategoriaServiceImpl implements CategoriaService{
    @PersistenceContext
    private EntityManager em;


  
    @Override
    public List<CategoriaDTO> findAll(){
        
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Categoria> from = criteriaQuery.from(Categoria.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        
        TypedQuery<Object> typedQuery = em.createQuery(select);

        List<Object> resultList = typedQuery.getResultList();

        List<CategoriaDTO> resultado = CategoriaMapper.convertToDTO(resultList);

        return resultado;
    }
}
