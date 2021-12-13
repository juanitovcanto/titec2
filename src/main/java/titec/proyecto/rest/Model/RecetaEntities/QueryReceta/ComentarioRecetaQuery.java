package titec.proyecto.rest.Model.RecetaEntities.QueryReceta;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "COMENTARIOS",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class ComentarioRecetaQuery implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "TEXTO")
  private String texto;

  @Column(name = "FECHA_COM")
  private Date fechaCom;

  @Column(name = "FECHA_EDIT")
  private Date fechaEdit;

  @ManyToOne
  @JoinColumn(name = "ID_RECETA")
  private RecetaQuery receta;

  @ManyToOne
  @JoinColumn(name = "ID_USER")
  private ComentarioUsuarioQuery usuario;

  public ComentarioRecetaQuery() {
  }

  public ComentarioRecetaQuery(Long id, String texto, Date fechaCom, Date fechaEdit, RecetaQuery receta,
      ComentarioUsuarioQuery usuario) {
    this.id = id;
    this.texto = texto;
    this.fechaCom = fechaCom;
    this.fechaEdit = fechaEdit;
    this.receta = receta;
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

  public RecetaQuery getReceta() {
    return receta;
  }

  public void setReceta(RecetaQuery receta) {
    this.receta = receta;
  }

  public ComentarioUsuarioQuery getUsuario() {
    return usuario;
  }

  public void setUsuario(ComentarioUsuarioQuery usuario) {
    this.usuario = usuario;
  }

  
  
}
