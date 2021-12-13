package titec.proyecto.rest.DTO.QueryUsuarioDTO;

public class FollowUsuarioEspecificoDTO {
  
  private Long id;
  private SeguidoresQueryDTO seguidor;
  public FollowUsuarioEspecificoDTO() {
  }
  public FollowUsuarioEspecificoDTO(Long id, SeguidoresQueryDTO seguidor) {
    this.id = id;
    this.seguidor = seguidor;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public SeguidoresQueryDTO getSeguidor() {
    return seguidor;
  }
  public void setSeguidor(SeguidoresQueryDTO seguidor) {
    this.seguidor = seguidor;
  }

  

}
