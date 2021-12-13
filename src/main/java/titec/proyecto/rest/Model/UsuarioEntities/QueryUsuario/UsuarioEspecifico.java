package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class UsuarioEspecifico implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name="NOMBRE")
  private String nombre;

  @Column(name="APELLIDO")
  private String apellido;

  @Column(name="USERNAME")
  private String username;

  @Column(name = "EMAIL")
  private String email;

  @Transient
  private int numFollowers;

  @OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private PerfilEspecifico perfil;

  @OneToMany(mappedBy = "usuario",fetch = FetchType.LAZY)
  private List<FollowUsuarioEspecifico> followers = new ArrayList<>();

  @OneToMany(mappedBy = "usuario",fetch = FetchType.LAZY)
  private List<RecetaDeUsuarioEspecifico> recetas = new ArrayList<>();
  
  public UsuarioEspecifico() {
  }

  public UsuarioEspecifico(Long id, String nombre, String apellido, String username, String email,
      PerfilEspecifico perfil, List<FollowUsuarioEspecifico> followers, List<RecetaDeUsuarioEspecifico> recetas) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.username = username;
    this.email = email;
    this.perfil = perfil;
    this.followers = followers;
    this.recetas = recetas;
  }


  @PostLoad
  private void PostLoad(){
    this.numFollowers = followers.size();
  }
  

  public int getNumFollowers() {
    return numFollowers;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PerfilEspecifico getPerfil() {
    return perfil;
  }

  public void setPerfil(PerfilEspecifico perfil) {
    this.perfil = perfil;
  }

  public List<FollowUsuarioEspecifico> getFollowers() {
    return followers;
  }

  public List<RecetaDeUsuarioEspecifico> getRecetas() {
    return recetas;
  }

  public void setRecetas(List<RecetaDeUsuarioEspecifico> recetas) {
    this.recetas = recetas;
  }
  
  
}
