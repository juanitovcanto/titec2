package titec.proyecto.rest.DTO.LoginDTO;

public class UserTokenDTO {
  private Long id;
  private String nombre;
  private String username;
  private String accessToken;
  public UserTokenDTO() {
  }
  public UserTokenDTO(Long id, String nombre, String username, String accessToken) {
    this.id = id;
    this.nombre = nombre;
    this.username = username;
    this.accessToken = accessToken;
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
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
  
  
  
}
