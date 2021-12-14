package titec.proyecto.rest.DTO.QueryRecetaDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecetaQueryDTO {
  private Long id;
  private String titulo;
  private String texto;
  private Date fechaPost;
  private Date fechaEdit;
  private List<ImagenQueryDTO> imagenes = new ArrayList<>();
  private CategoriaQueryDTO categoria;
  private UsuarioRecetaQueryDTO usuario;
  private DificultadQueryDTO dificultad;
  private List<ComentarioRecetaDTO> comentarios = new ArrayList<>();
  private List<RecetaLikeQueryDTO> likes = new ArrayList<>();
  private int numLikes;
  
  public RecetaQueryDTO() {
  }

  





  public RecetaQueryDTO(Long id, String titulo, String texto, Date fechaPost, Date fechaEdit,
      List<ImagenQueryDTO> imagenes, CategoriaQueryDTO categoria, UsuarioRecetaQueryDTO usuario,
      DificultadQueryDTO dificultad, List<ComentarioRecetaDTO> comentarios, List<RecetaLikeQueryDTO> likes,
      int numLikes) {
    this.id = id;
    this.titulo = titulo;
    this.texto = texto;
    this.fechaPost = fechaPost;
    this.fechaEdit = fechaEdit;
    this.imagenes = imagenes;
    this.categoria = categoria;
    this.usuario = usuario;
    this.dificultad = dificultad;
    this.comentarios = comentarios;
    this.likes = likes;
    this.numLikes = numLikes;
  }







  public List<RecetaLikeQueryDTO> getLikes() {
    return likes;
  }







  public void setLikes(List<RecetaLikeQueryDTO> likes) {
    this.likes = likes;
  }







  public int getNumLikes() {
    return numLikes;
  }







  public void setNumLikes(int numLikes) {
    this.numLikes = numLikes;
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

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Date getFechaPost() {
    return fechaPost;
  }

  public void setFechaPost(Date fechaPost) {
    this.fechaPost = fechaPost;
  }

  public Date getFechaEdit() {
    return fechaEdit;
  }

  public void setFechaEdit(Date fechaEdit) {
    this.fechaEdit = fechaEdit;
  }

  public List<ImagenQueryDTO> getImagenes() {
    return imagenes;
  }

  public void setImagenes(List<ImagenQueryDTO> imagenes) {
    this.imagenes = imagenes;
  }

  public CategoriaQueryDTO getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaQueryDTO categoria) {
    this.categoria = categoria;
  }

  public UsuarioRecetaQueryDTO getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioRecetaQueryDTO usuario) {
    this.usuario = usuario;
  }

  public DificultadQueryDTO getDificultad() {
    return dificultad;
  }

  public void setDificultad(DificultadQueryDTO dificultad) {
    this.dificultad = dificultad;
  }

  public List<ComentarioRecetaDTO> getComentarios() {
    return comentarios;
  }

  public void setComentarios(List<ComentarioRecetaDTO> comentarios) {
    this.comentarios = comentarios;
  }

  

}
