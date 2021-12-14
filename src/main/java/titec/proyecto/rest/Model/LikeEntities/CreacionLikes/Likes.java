package titec.proyecto.rest.Model.LikeEntities.CreacionLikes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "LIKES",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Likes  implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "ID_USER")
  private Long idUser;

  @Column(name = "ID_RECETA")
  private Long idReceta;

  public Likes() {
  }

  public Likes(Long id, Long idUser, Long idReceta) {
    this.id = id;
    this.idUser = idUser;
    this.idReceta = idReceta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdUser() {
    return idUser;
  }

  public void setIdUser(Long idUser) {
    this.idUser = idUser;
  }

  public Long getIdReceta() {
    return idReceta;
  }

  public void setIdReceta(Long idReceta) {
    this.idReceta = idReceta;
  }
  
}
