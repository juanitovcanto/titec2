package titec.proyecto.rest.Model.LoginEntities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class UsuarioLogin implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "NOMBRE")
  private String nombre;

  @Column(name = "USERNAME")
  private String username;

  @Column(name = "PASSWORD")
  private String password;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TIPO",referencedColumnName = "ID")
  private TipoUsuario tipo;

  public UsuarioLogin() {
  }
  

  public UsuarioLogin(Long id, String nombre, String username, String password, TipoUsuario tipo) {
    this.id = id;
    this.nombre = nombre;
    this.username = username;
    this.password = password;
    this.tipo = tipo;
  }
  


  public void setId(Long id) {
    this.id = id;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public void setTipo(TipoUsuario tipo) {
    this.tipo = tipo;
  }


  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }


  public String getUsername() {
    return username;
  }


  public String getPassword() {
    return password;
  }


  public TipoUsuario getTipo() {
    return tipo;
  }

  
  
}
