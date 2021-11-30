package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "IMAGEN",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class ImagenQuery  implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "SRC")
  private String src;

  @ManyToOne
  @JoinColumn(name = "ID_RECETA")
  private RecetaQuery receta;

  public ImagenQuery() {
  }

  public ImagenQuery(Long id, String src, RecetaQuery receta) {
    this.id = id;
    this.src = src;
    this.receta = receta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public RecetaQuery getReceta() {
    return receta;
  }

  public void setReceta(RecetaQuery receta) {
    this.receta = receta;
  }

  
  
}
