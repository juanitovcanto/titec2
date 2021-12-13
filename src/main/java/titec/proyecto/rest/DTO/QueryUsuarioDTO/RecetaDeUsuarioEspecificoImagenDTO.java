package titec.proyecto.rest.DTO.QueryUsuarioDTO;

public class RecetaDeUsuarioEspecificoImagenDTO {
  private Long id;
  private String src;
  private Boolean imagenPrincipal;
  public RecetaDeUsuarioEspecificoImagenDTO() {
  }
  public RecetaDeUsuarioEspecificoImagenDTO(Long id, String src, Boolean imagenPrincipal) {
    this.id = id;
    this.src = src;
    this.imagenPrincipal = imagenPrincipal;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }
  public Boolean getImagenPrincipal() {
    return imagenPrincipal;
  }
  public void setImagenPrincipal(Boolean imagenPrincipal) {
    this.imagenPrincipal = imagenPrincipal;
  }
  

  
  
  
}
