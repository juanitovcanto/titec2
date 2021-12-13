package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DIFICULTAD",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class DificultadUsuarioEspecifico implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "DIFICULTAD")
  private String dificultad;

  @OneToMany(mappedBy = "dificultad")
  private List<RecetaDeUsuarioEspecifico> receta = new ArrayList<>();

  public DificultadUsuarioEspecifico() {
  }

  public DificultadUsuarioEspecifico(Long id, String dificultad, List<RecetaDeUsuarioEspecifico> receta) {
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

  public List<RecetaDeUsuarioEspecifico> getReceta() {
    return receta;
  }

  public void setReceta(List<RecetaDeUsuarioEspecifico> receta) {
    this.receta = receta;
  }

  


  
}
