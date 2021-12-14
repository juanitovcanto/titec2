package titec.proyecto.rest.DTO.QueryRecetaDTO;

public class RecetaLikeQueryDTO {
  private Long id;
  private RecetaLikeUsuarioQueryDTO receta;
  public RecetaLikeQueryDTO() {
  }
  public RecetaLikeQueryDTO(Long id, RecetaLikeUsuarioQueryDTO receta) {
    this.id = id;
    this.receta = receta;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public RecetaLikeUsuarioQueryDTO getReceta() {
    return receta;
  }
  public void setReceta(RecetaLikeUsuarioQueryDTO receta) {
    this.receta = receta;
  }

  
  
}
