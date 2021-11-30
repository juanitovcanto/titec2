package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class ComentarioUsuarioQuery implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "NOMBRE")
  private String nombre;

  @Column(name = "APELLIDO")
  private String apellido;

  @Column(name = "USERNAME")
  private String username;

  @OneToOne
  @JoinColumn(name = "ID_USER")
  private ComentarioRecetaQuery comentario;

  public ComentarioUsuarioQuery() {
  }

  public ComentarioUsuarioQuery(Long id, String nombre, String apellido, String username,
      ComentarioRecetaQuery comentario) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.username = username;
    this.comentario = comentario;
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

  public ComentarioRecetaQuery getComentario() {
    return comentario;
  }

  public void setComentario(ComentarioRecetaQuery comentario) {
    this.comentario = comentario;
  }

  
  
}
