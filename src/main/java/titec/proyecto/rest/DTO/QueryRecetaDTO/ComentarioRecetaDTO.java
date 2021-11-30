package titec.proyecto.rest.DTO.QueryRecetaDTO;

import java.util.Date;

public class ComentarioRecetaDTO {
  private Long id;
  private String texto;
  private Date fechaCom;
  private Date fechaEdit;
  private ComentarioUsuarioQueryDTO usuario;
  
  public ComentarioRecetaDTO() {
  }

  public ComentarioRecetaDTO(Long id, String texto, Date fechaCom, Date fechaEdit, ComentarioUsuarioQueryDTO usuario) {
    this.id = id;
    this.texto = texto;
    this.fechaCom = fechaCom;
    this.fechaEdit = fechaEdit;
    this.usuario = usuario;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Date getFechaCom() {
    return fechaCom;
  }

  public void setFechaCom(Date fechaCom) {
    this.fechaCom = fechaCom;
  }

  public Date getFechaEdit() {
    return fechaEdit;
  }

  public void setFechaEdit(Date fechaEdit) {
    this.fechaEdit = fechaEdit;
  }

  public ComentarioUsuarioQueryDTO getUsuario() {
    return usuario;
  }

  public void setUsuario(ComentarioUsuarioQueryDTO usuario) {
    this.usuario = usuario;
  }


}
