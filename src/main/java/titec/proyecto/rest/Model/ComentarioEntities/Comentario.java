package titec.proyecto.rest.Model.ComentarioEntities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "COMENTARIOS",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Comentario implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "TEXTO")
  private String texto;

  @CreationTimestamp
  @Column(name = "FECHA_COM",nullable = false,updatable = false)
  private Date fechaCom;

  @Column(name = "ID_RECETA")
  private Long idReceta;

  @Column(name = "ID_USER")
  private Long idUser;

  public Comentario() {
  }

  public Comentario(Long id, String texto, Date fechaCom, Long idReceta, Long idUser) {
    this.id = id;
    this.texto = texto;
    this.fechaCom = fechaCom;
    this.idReceta = idReceta;
    this.idUser = idUser;
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

  public Long getIdReceta() {
    return idReceta;
  }

  public void setIdReceta(Long idReceta) {
    this.idReceta = idReceta;
  }

  public Long getIdUser() {
    return idUser;
  }

  public void setIdUser(Long idUser) {
    this.idUser = idUser;
  }

  
  
}
