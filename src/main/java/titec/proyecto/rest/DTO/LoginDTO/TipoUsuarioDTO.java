package titec.proyecto.rest.DTO.LoginDTO;

public class TipoUsuarioDTO {
  private Long id;
  private String tipoUsuario;

  public TipoUsuarioDTO() {
  }

  public TipoUsuarioDTO(Long id, String tipoUsuario) {
    this.id = id;
    this.tipoUsuario = tipoUsuario;
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getTipoUsuario() {
    return tipoUsuario;
  }
  public void setTipoUsuario(String tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }

  
  
}
