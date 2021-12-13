package titec.proyecto.rest.DTO.QueryUsuarioDTO;

public class DificultadUsuarioEspecificoDTO {
  private Long id;
  private String dificultad;

  
  public DificultadUsuarioEspecificoDTO() {
  }


  public DificultadUsuarioEspecificoDTO(Long id, String dificultad) {
    this.id = id;
    this.dificultad = dificultad;
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getDificultad() {
    return dificultad;
  }


  public void setDificultad(String dificultad) {
    this.dificultad = dificultad;
  }
  
  
}
