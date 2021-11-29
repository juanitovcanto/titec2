package titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Usuario implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name="NOMBRE")
  private String nombre;

  @Column(name="APELLIDO")
  private String apellido;

  @Column(name="USERNAME")
  private String username;

  @Column(name="PASSWORD")
  private String password;

  @Column(name = "EMAIL")
  private String email;
  
  @Column(name="TIPO")
  private long tipoUsuario;

  @OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private Perfil perfil;

  public Usuario() {
  }

  public Usuario(Long id, String nombre, String apellido, String username, String password, String email,
      long tipoUsuario, Perfil perfil) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.username = username;
    this.password = password;
    this.email = email;
    this.tipoUsuario = tipoUsuario;
    this.perfil = perfil;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getTipoUsuario() {
    return tipoUsuario;
  }

  public void setTipoUsuario(long tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }

  public Perfil getPerfil() {
    return perfil;
  }

  public void setPerfil(Perfil perfil) {
    this.perfil = perfil;
    this.perfil.setUsuario(this);
  }

 

}
