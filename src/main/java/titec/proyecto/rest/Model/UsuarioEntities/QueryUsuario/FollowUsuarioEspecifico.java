package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "FOLLOW",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class FollowUsuarioEspecifico implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "ID_SEGUIDO")
  private UsuarioEspecifico usuario;

  @ManyToOne
  @JoinColumn(name = "ID_SEGUIDOR")
  private SeguidoresQuery seguido;

  public FollowUsuarioEspecifico() {
  }

  public FollowUsuarioEspecifico(Long id, UsuarioEspecifico usuario, SeguidoresQuery seguido) {
    this.id = id;
    this.usuario = usuario;
    this.seguido = seguido;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UsuarioEspecifico getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioEspecifico usuario) {
    this.usuario = usuario;
  }

  public SeguidoresQuery getSeguido() {
    return seguido;
  }

  public void setSeguido(SeguidoresQuery seguido) {
    this.seguido = seguido;
  }


  
  
}
