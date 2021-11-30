package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DIFICULTAD",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class DificultadQuery implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "DIFICULTAD")
  private String dificultad;

  @OneToOne(mappedBy = "dificultad")
  private RecetaQuery receta;

  public DificultadQuery() {
  }

  public DificultadQuery(Long id, String dificultad, RecetaQuery receta) {
    this.id = id;
    this.dificultad = dificultad;
    this.receta = receta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDificultad() {
    return dificultad;
  }

  public void setDificultad(String dificultad) {
    this.dificultad = dificultad;
  }

  public RecetaQuery getReceta() {
    return receta;
  }

  public void setReceta(RecetaQuery receta) {
    this.receta = receta;
  }
  
  
  
}
