package titec.proyecto.rest.DTO.QueryRecetaDTO;

public class CategoriaQueryDTO {

  private Long id;
  private String categoria;
  
  public CategoriaQueryDTO() {
  }

  public CategoriaQueryDTO(Long id, String categoria) {
    this.id = id;
    this.categoria = categoria;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  
  
}
