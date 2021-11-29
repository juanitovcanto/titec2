package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PAIS",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class PaisesEspecifico implements Serializable {

  private static final long serialVersionUID = 1L;

  
  @Id
  private long id;

  @Column(name = "NOMBRE")
  private String pais;

  @OneToOne(mappedBy = "pais")
  private PerfilEspecifico perfil;

  public PaisesEspecifico() {
  }

  public PaisesEspecifico(long id, String pais, PerfilEspecifico perfil) {
    this.id = id;
    this.pais = pais;
    this.perfil = perfil;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public PerfilEspecifico getPerfil() {
    return perfil;
  }

  public void setPerfil(PerfilEspecifico perfil) {
    this.perfil = perfil;
  }



}
