package titec.proyecto.rest.DTO;

public class PaisDTO {
  private long id;
  private String pais;
  
  public PaisDTO() {
  }

  public PaisDTO(long id, String pais) {
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
