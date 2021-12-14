package titec.proyecto.rest.Model.LoginEntities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TIPO_USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class TipoUsuario implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "TIPO_USUARIO")
  private String tipoUsuario;

  @OneToMany(mappedBy = "tipo")
  List<UsuarioLogin> usuario = new ArrayList<>();

  public TipoUsuario() {
  }

  public TipoUsuario(Long id, List<UsuarioLogin> usuario , String tipoUsuario) {
    this.id = id;
    this.tipoUsuario = tipoUsuario;
    this.usuario = usuario;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTipoUsuario() {
    return tipoUsuario;
  }

  public void setTipoUsuario(String tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }

  public List<UsuarioLogin> getUsuario() {
    return usuario;
  }

  public void setUsuario(List<UsuarioLogin> usuario) {
    this.usuario = usuario;
  }

  
  
}
