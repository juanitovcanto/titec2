package titec.proyecto.rest.Model.RecetaEntities.CreacionReceta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "RECETA",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Receta implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "TITULO")
  private String titulo;

  @Column(name = "TEXTO")
  private String texto;

  @CreationTimestamp
  @Column(name = "FECHA_POST",nullable = false,updatable = false)
  private Date fechaPost;


  @Column(name = "CATEGORIA_ID")
  private Long categoriaId;

  @Column(name = "DIFICULTAD_ID")
  private Long dificultadId;

  @Column(name = "ID_USER")
  private Long userId;
  
  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_RECETA")
  private List<Imagen> imagenes = new ArrayList<>();


  public Receta() {
  }


  public Receta(Long id, String titulo, String texto, Date fechaPost, Long categoriaId, Long dificultadId, Long userId,
      List<Imagen> imagenes) {
    this.id = id;
    this.titulo = titulo;
    this.texto = texto;
    this.fechaPost = fechaPost;
    this.categoriaId = categoriaId;
    this.dificultadId = dificultadId;
    this.userId = userId;
    this.imagenes = imagenes;
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


  public Long getCategoriaId() {
    return categoriaId;
  }


  public void setCategoriaId(Long categoriaId) {
    this.categoriaId = categoriaId;
  }


  public Long getDificultadId() {
    return dificultadId;
  }


  public void setDificultadId(Long dificultadId) {
    this.dificultadId = dificultadId;
  }


  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public List<Imagen> getImagenes() {
    return imagenes;
  }


  public void setImagenes(List<Imagen> imagenes) {
    this.imagenes = imagenes;
  }

  


}
