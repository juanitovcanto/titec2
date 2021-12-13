package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.FetchType;


@Entity
@Table(name = "RECETA",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class RecetaDeUsuarioEspecifico implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "TITULO")
  private String titulo;

  @Column(name = "FECHA_POST",nullable = false,updatable = false)
  private Date fechaPost;

  @ManyToOne
  @JoinColumn(name = "ID_USER",referencedColumnName = "ID")
  private UsuarioEspecifico usuario;

  
  @OneToMany(mappedBy = "receta",fetch = FetchType.LAZY)
  private List<RecetaDeUsuarioEspecificoImagen> imagen = new ArrayList<>();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DIFICULTAD_ID",referencedColumnName = "ID")
  private DificultadUsuarioEspecifico dificultad;

  public RecetaDeUsuarioEspecifico() {
  }

  public RecetaDeUsuarioEspecifico(Long id, String titulo, Date fechaPost, UsuarioEspecifico usuario,
      List<RecetaDeUsuarioEspecificoImagen> imagen, DificultadUsuarioEspecifico dificultad) {
    this.id = id;
    this.titulo = titulo;
    this.fechaPost = fechaPost;
    this.usuario = usuario;
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

  public UsuarioEspecifico getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioEspecifico usuario) {
    this.usuario = usuario;
  }

  public List<RecetaDeUsuarioEspecificoImagen> getImagen() {
    return imagen;
  }

  public void setImagen(List<RecetaDeUsuarioEspecificoImagen> imagen) {
    this.imagen = imagen;
  }

  public DificultadUsuarioEspecifico getDificultad() {
    return dificultad;
  }

  public void setDificultad(DificultadUsuarioEspecifico dificultad) {
    this.dificultad = dificultad;
  }

 
  



  

  

  
}
