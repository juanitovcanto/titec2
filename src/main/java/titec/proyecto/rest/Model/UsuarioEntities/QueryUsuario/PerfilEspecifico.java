package titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="PERFIL")
public class PerfilEspecifico implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "USER_ID")
  private Long id;

  @Column(name = "BIOGRAFIA")
  private String biografia;

  @Column(name = "FECHA_NAC",columnDefinition = "DATE")
  private LocalDate fecha;

  @Column(name = "IMAGEN")
  private String imagen;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PAIS",referencedColumnName = "ID")
  private PaisesEspecifico pais;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  @JoinColumn(name = "ID_USER")
  private UsuarioEspecifico usuario;


  
  public PerfilEspecifico() {
  }


  public PerfilEspecifico(Long id, String biografia, LocalDate fecha, String imagen, PaisesEspecifico pais,
      UsuarioEspecifico usuario) {
    this.id = id;
    this.biografia = biografia;
    this.fecha = fecha;
    this.imagen = imagen;
    this.pais = pais;
    this.usuario = usuario;
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getBiografia() {
    return biografia;
  }


  public void setBiografia(String biografia) {
    this.biografia = biografia;
  }


  public LocalDate getFecha() {
    return fecha;
  }


  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }


  public String getImagen() {
    return imagen;
  }


  public void setImagen(String imagen) {
    this.imagen = imagen;
  }


  public PaisesEspecifico getPais() {
    return pais;
  }


  public void setPais(PaisesEspecifico pais) {
    this.pais = pais;
  }


  public UsuarioEspecifico getUsuario() {
    return usuario;
  }


  public void setUsuario(UsuarioEspecifico usuario) {
    this.usuario = usuario;
  }

  
}
