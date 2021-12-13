package titec.proyecto.rest.DTO.QueryUsuarioDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecetaDeUsuarioEspecificoDTO {
  private Long id;
  private String titulo;
  private Date fechaPost;
  private List<RecetaDeUsuarioEspecificoImagenDTO> imagen = new ArrayList<>();
  private DificultadUsuarioEspecificoDTO dificultad;
  
  public RecetaDeUsuarioEspecificoDTO() {
  }

  public RecetaDeUsuarioEspecificoDTO(Long id, String titulo, Date fechaPost,
      List<RecetaDeUsuarioEspecificoImagenDTO> imagen, DificultadUsuarioEspecificoDTO dificultad) {
    this.id = id;
    this.titulo = titulo;
    this.fechaPost = fechaPost;
    this.imagen = imagen;
    this.dificultad = dificultad;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Date getFechaPost() {
    return fechaPost;
  }

  public void setFechaPost(Date fechaPost) {
    this.fechaPost = fechaPost;
  }

  public List<RecetaDeUsuarioEspecificoImagenDTO> getImagen() {
    return imagen;
  }

  public void setImagen(List<RecetaDeUsuarioEspecificoImagenDTO> imagen) {
    this.imagen = imagen;
  }

  public DificultadUsuarioEspecificoDTO getDificultad() {
    return dificultad;
  }

  public void setDificultad(DificultadUsuarioEspecificoDTO dificultad) {
    this.dificultad = dificultad;
  }

  
  
}
