package titec.proyecto.rest.DTO.QueryUsuarioDTO;

import java.util.ArrayList;
import java.util.List;

public class UsuarioEspecificoDTO {
  
  private Long id;
  private String nombre;
  private String apellido;
  private String username;
  private String email;
  private PerfilEspecificoDTO perfil;
  private List<FollowUsuarioEspecificoDTO> followers = new ArrayList<>();
  private int numFollowers;
  private List<RecetaDeUsuarioEspecificoDTO> recetas = new ArrayList<>();
  
  
 
  public UsuarioEspecificoDTO() {
  }


  public UsuarioEspecificoDTO(Long id, String nombre, String apellido, String username, String email,
      PerfilEspecificoDTO perfil, List<FollowUsuarioEspecificoDTO> followers, int numFollowers,
      List<RecetaDeUsuarioEspecificoDTO> recetas) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.username = username;
    this.email = email;
    this.perfil = perfil;
    this.followers = followers;
    this.numFollowers = numFollowers;
    this.recetas = recetas;
  }




  public List<RecetaDeUsuarioEspecificoDTO> getRecetas() {
    return recetas;
  }


  public void setRecetas(List<RecetaDeUsuarioEspecificoDTO> recetas) {
    this.recetas = recetas;
  }


  public int getNumFollowers() {
    return numFollowers;
  }

  public void setNumFollowers(int numFollowers) {
    this.numFollowers = numFollowers;
  }

  public List<FollowUsuarioEspecificoDTO> getFollowers() {
    return followers;
  }
  
  public void setFollowers(List<FollowUsuarioEspecificoDTO> followers) {
    this.followers = followers;
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

  public PerfilEspecificoDTO getPerfil() {
    return perfil;
  }

  public void setPerfil(PerfilEspecificoDTO perfil) {
    this.perfil = perfil;
  }

  
}
