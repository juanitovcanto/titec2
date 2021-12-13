package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "IMAGEN",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class RecetaDeUsuarioEspecificoImagen implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "SRC")
  private String src;

  @Column(name = "IMAGEN_PRINCIPAL",columnDefinition = "tinyint(1)")
  private Boolean imagenPrincipal;

  @OneToOne
  @JoinColumn(name = "ID_RECETA")
  private RecetaDeUsuarioEspecifico receta;

  public RecetaDeUsuarioEspecificoImagen() {
  }

  public RecetaDeUsuarioEspecificoImagen(Long id, String src, Boolean imagenPrincipal,
      RecetaDeUsuarioEspecifico receta) {
    this.id = id;
    this.src = src;
    this.imagenPrincipal = imagenPrincipal;
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

  public Boolean getImagenPrincipal() {
    return imagenPrincipal;
  }

  public void setImagenPrincipal(Boolean imagenPrincipal) {
    this.imagenPrincipal = imagenPrincipal;
  }

  public RecetaDeUsuarioEspecifico getReceta() {
    return receta;
  }

  public void setReceta(RecetaDeUsuarioEspecifico receta) {
    this.receta = receta;
  }

  
  
}
