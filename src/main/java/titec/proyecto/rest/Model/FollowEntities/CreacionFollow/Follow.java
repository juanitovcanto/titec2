package titec.proyecto.rest.Model.FollowEntities.CreacionFollow;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "FOLLOW",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Follow implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "ID_SEGUIDOR")
  private Long idSeguidor;

  @Column(name = "ID_SEGUIDO")
  private Long idSeguido;

  public Follow() {
  }

  public Follow(Long id, Long idSeguidor, Long idSeguido) {
    this.id = id;
    this.idSeguidor = idSeguidor;
    this.idSeguido = idSeguido;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdSeguidor() {
    return idSeguidor;
  }

  public void setIdSeguidor(Long idSeguidor) {
    this.idSeguidor = idSeguidor;
  }

  public Long getIdSeguido() {
    return idSeguido;
  }

  public void setIdSeguido(Long idSeguido) {
    this.idSeguido = idSeguido;
  }

  
}
