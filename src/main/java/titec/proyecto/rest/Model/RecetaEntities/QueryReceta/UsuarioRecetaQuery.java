package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;

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
@Table(name = "USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class UsuarioRecetaQuery implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "NOMBRE")
  private String nombre;

  @Column(name = "APELLIDO")
  private String apellido;

  @Column(name = "USERNAME")
  private String username;
  
  @OneToMany(mappedBy = "usuario")
  private List<RecetaQuery> receta = new ArrayList<>();

  public UsuarioRecetaQuery() {
  }

  public UsuarioRecetaQuery(Long id, String nombre, String apellido, String username, List<RecetaQuery> receta) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.username = username;
    this.receta = receta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<RecetaQuery> getReceta() {
    return receta;
  }

  public void setReceta(List<RecetaQuery> receta) {
    this.receta = receta;
  }

 
  
}
