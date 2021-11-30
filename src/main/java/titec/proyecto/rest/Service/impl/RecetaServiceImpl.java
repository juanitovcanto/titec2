package titec.proyecto.rest.Service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import titec.proyecto.rest.DTO.QueryRecetaDTO.RecetaQueryDTO;
import titec.proyecto.rest.Mapper.RecetaEspecificoMapper;
import titec.proyecto.rest.Model.RecetaEntities.CreacionReceta.Receta;
import titec.proyecto.rest.Model.RecetaEntities.QueryReceta.RecetaQuery;
import titec.proyecto.rest.Service.RecetaService;

@Stateless
public class RecetaServiceImpl implements RecetaService{

  @PersistenceContext
  private EntityManager em;

  @Override
  public void insertReceta(Receta receta){
    em.persist(receta);
  }

  @Override
  public RecetaQueryDTO findById(Long id){
    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    CriteriaQuery<RecetaQuery> criteriaQuery = criteriaBuilder.createQuery(RecetaQuery.class);
    Root<RecetaQuery> from = criteriaQuery.from(RecetaQuery.class);
    CriteriaQuery<RecetaQuery> select = criteriaQuery.select(from);

    try{
      select.where(criteriaBuilder.equal(from.get("id"), id));
      TypedQuery<RecetaQuery> typedQuery = em.createQuery(select);
      RecetaQuery resultadoEntity = typedQuery.getSingleResult();

      if (resultadoEntity == null){
        return null;
      }
      RecetaQueryDTO resultadoDTO = new RecetaQueryDTO();
      resultadoDTO = RecetaEspecificoMapper.convertToDto(resultadoEntity);

      return resultadoDTO;


    }catch (Exception e){
      e.printStackTrace();
    }

    return null;



  }
  
}
