package titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TIPO_USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class TipoUsuario implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private long id;

  @Column(name = "TIPO_USUARIO")
  private String tipoUsuario;



  public TipoUsuario() {
  }

  public TipoUsuario(long id, String tipoUsuario) {
    this.id = id;
    this.tipoUsuario = tipoUsuario;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTipoUsuario() {
    return tipoUsuario;
  }

  public void setTipoUsuario(String tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }


}
