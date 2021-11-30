package titec.proyecto.rest.Model.RecetaEntities.CreacionReceta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "IMAGEN",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Imagen implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "SRC")
  private String src;

  @Column(name = "IMAGEN_PRINCIPAL")
  private boolean imagenPrincipal;

  

  public Imagen() {
  }



  public Imagen(Long id, String src, boolean imagenPrincipal) {
    this.id = id;
    this.src = src;
    this.imagenPrincipal = imagenPrincipal;
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



  public boolean isImagenPrincipal() {
    return imagenPrincipal;
  }



  public void setImagenPrincipal(boolean imagenPrincipal) {
    this.imagenPrincipal = imagenPrincipal;
  }

  

  
  
}
