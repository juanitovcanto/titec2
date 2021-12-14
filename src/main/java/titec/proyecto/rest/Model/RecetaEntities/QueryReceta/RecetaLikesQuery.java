package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "LIKES",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class RecetaLikesQuery implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "ID_RECETA")
  private RecetaQuery receta;

  @ManyToOne
  @JoinColumn(name = "ID_USER")
  private RecetaLikeUsuario usuario;

  public RecetaLikesQuery() {
  }

  public RecetaLikesQuery(Long id, RecetaQuery receta, RecetaLikeUsuario usuario) {
    this.id = id;
    this.receta = receta;
    this.usuario = usuario;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RecetaQuery getReceta() {
    return receta;
  }

  public void setReceta(RecetaQuery receta) {
    this.receta = receta;
  }

  public RecetaLikeUsuario getUsuario() {
    return usuario;
  }

  public void setUsuario(RecetaLikeUsuario usuario) {
    this.usuario = usuario;
  }

  
  
}
