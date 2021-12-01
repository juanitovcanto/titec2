package titec.proyecto.rest.DTO.QueryRecetaDTO;

public class ImagenQueryDTO {

  private Long id;
  private String src;

  public ImagenQueryDTO() {
  }
  public ImagenQueryDTO(Long id, String src) {
    this.id = id;
    this.src = src;
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
  

}
