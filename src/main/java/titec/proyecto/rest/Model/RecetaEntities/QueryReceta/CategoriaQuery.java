package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CATEGORIA",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class CategoriaQuery implements Serializable  {
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "CATEGORIA")
  private String categoria;

  @OneToOne(mappedBy = "categoria")
  private RecetaQuery receta;

  public CategoriaQuery() {
  }

  public CategoriaQuery(Long id, String categoria, RecetaQuery receta) {
    this.id = id;
    this.categoria = categoria;
    this.receta = receta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public RecetaQuery getReceta() {
    return receta;
  }

  public void setReceta(RecetaQuery receta) {
    this.receta = receta;
  }
  
  
}
