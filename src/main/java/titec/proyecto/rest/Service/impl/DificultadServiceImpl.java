package titec.proyecto.rest.Service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import titec.proyecto.rest.DTO.DificultadDTO;
import titec.proyecto.rest.Mapper.DificultadMapper;
import titec.proyecto.rest.Model.Dificultad;
import titec.proyecto.rest.Service.DificultadService;

public class DificultadServiceImpl implements DificultadService {
  @PersistenceContext
  private EntityManager em;

  @Override
  public List<DificultadDTO> findAll(){
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Dificultad> cq = cb.createQuery(Dificultad.class);
    Root<Dificultad> diRoot = cq.from(Dificultad.class);

    CriteriaQuery<Dificultad> diQuery = cq.select(diRoot);

    TypedQuery<Dificultad> typedQuery = em.createQuery(diQuery);

    List<Dificultad> resultList = typedQuery.getResultList();

    List<DificultadDTO> resultado = DificultadMapper.convertToDTO(resultList);

    return resultado;

  }
  
}
