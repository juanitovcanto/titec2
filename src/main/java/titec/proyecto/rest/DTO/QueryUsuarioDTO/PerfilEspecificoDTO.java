package titec.proyecto.rest.DTO.QueryUsuarioDTO;

import java.time.LocalDate;

public class PerfilEspecificoDTO {
  private Long id;
  private String biografia;
  private LocalDate fecha;
  private String imagen;
  private PaisesEspecificoDTO pais;
  
  public PerfilEspecificoDTO() {
  }

  public PerfilEspecificoDTO(Long id, String biografia, LocalDate fecha, String imagen, PaisesEspecificoDTO pais) {
    this.id = id;
    this.biografia = biografia;
    this.fecha = fecha;
    this.imagen = imagen;
    this.pais = pais;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBiografia() {
    return biografia;
  }

  public void setBiografia(String biografia) {
    this.biografia = biografia;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  public PaisesEspecificoDTO getPais() {
    return pais;
  }

  public void setPais(PaisesEspecificoDTO pais) {
    this.pais = pais;
  }

  

}
