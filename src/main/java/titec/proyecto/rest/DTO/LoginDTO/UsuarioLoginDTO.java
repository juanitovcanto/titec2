package titec.proyecto.rest.DTO.LoginDTO;

public class UsuarioLoginDTO {
  private Long id;
  private String nombre;
  private String username;
  private String password;
  private TipoUsuarioDTO tipo;
  public UsuarioLoginDTO() {
  }
  public UsuarioLoginDTO(Long id, String nombre, String username, String password, TipoUsuarioDTO tipo) {
    this.id = id;
    this.nombre = nombre;
    this.username = username;
    this.password = password;
    this.tipo = tipo;
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
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public TipoUsuarioDTO getTipo() {
    return tipo;
  }
  public void setTipo(TipoUsuarioDTO tipo) {
    this.tipo = tipo;
  }
  
  
}
