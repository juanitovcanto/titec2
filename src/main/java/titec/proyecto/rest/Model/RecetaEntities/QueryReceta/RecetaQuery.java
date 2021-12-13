package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "RECETA",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class RecetaQuery implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "TITULO")
  private String titulo;

  @Column(name = "TEXTO")
  private String texto;

  @Column(name = "FECHA_POST",nullable = false,updatable = false)
  private Date fechaPost;

  @Column(name = "FECHA_EDIT")
  private Date fechaEdit;

  @OneToMany(mappedBy = "receta",fetch = FetchType.LAZY)
  private List<ImagenQuery> imagenes = new ArrayList<>();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CATEGORIA_ID",referencedColumnName = "ID")
  private CategoriaQuery categoria;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER",referencedColumnName = "ID")
  private UsuarioRecetaQuery usuario;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DIFICULTAD_ID",referencedColumnName = "ID")
  private DificultadQuery dificultad;

  @OneToMany(mappedBy = "receta",fetch = FetchType.LAZY)
  private List<ComentarioRecetaQuery> comentarios = new ArrayList<>();

  public RecetaQuery() {
  }

  

  public RecetaQuery(Long id, String titulo, String texto, Date fechaPost, Date fechaEdit, List<ImagenQuery> imagenes,
      CategoriaQuery categoria, UsuarioRecetaQuery usuario, DificultadQuery dificultad,
      List<ComentarioRecetaQuery> comentarios) {
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

  public List<ImagenQuery> getImagenes() {
    return imagenes;
  }

  public void setImagenes(List<ImagenQuery> imagenes) {
    this.imagenes = imagenes;
  }

  public CategoriaQuery getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaQuery categoria) {
    this.categoria = categoria;
  }

  public UsuarioRecetaQuery getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioRecetaQuery usuario) {
    this.usuario = usuario;
  }

  public List<ComentarioRecetaQuery> getComentarios() {
    return comentarios;
  }

  public void setComentarios(List<ComentarioRecetaQuery> comentarios) {
    this.comentarios = comentarios;
  }



  public DificultadQuery getDificultad() {
    return dificultad;
  }



  public void setDificultad(DificultadQuery dificultad) {
    this.dificultad = dificultad;
  }


  
}
