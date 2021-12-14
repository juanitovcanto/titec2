package titec.proyecto.rest.Service.impl;

import titec.proyecto.rest.Service.PaisService;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import titec.proyecto.rest.DTO.PaisDTO;
import titec.proyecto.rest.Mapper.PaisMapper;
import titec.proyecto.rest.Model.Paises;

public class PaisServiceImpl implements PaisService {

  @PersistenceContext
  private EntityManager em;

  @Override
  public List<PaisDTO> findAll(){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Paises> from = criteriaQuery.from(Paises.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        
        TypedQuery<Object> typedQuery = em.createQuery(select);

        List<Object> resultList = typedQuery.getResultList();

        List<PaisDTO> resultado = PaisMapper.convertToDTO(resultList);

        return resultado;
  }
}
