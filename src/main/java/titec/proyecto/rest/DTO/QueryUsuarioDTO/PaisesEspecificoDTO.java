package titec.proyecto.rest.DTO.QueryUsuarioDTO;

public class PaisesEspecificoDTO {

  private long id;
  private String pais;
  
  public PaisesEspecificoDTO() {
  }

  public PaisesEspecificoDTO(long id, String pais) {
    this.id = id;
    this.pais = pais;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  
  
}
