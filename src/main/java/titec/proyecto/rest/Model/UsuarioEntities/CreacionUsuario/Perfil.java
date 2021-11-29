package titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Perfil implements Serializable{
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

  @Column(name = "PAIS")
  private Long idPais;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  @JoinColumn(name = "ID_USER")
  private Usuario usuario;

  public Perfil() {
  }

  public Perfil(Long id, String biografia, LocalDate fecha, String imagen, Long idPais, Usuario usuario) {
    this.id = id;
    this.biografia = biografia;
    this.fecha = fecha;
    this.imagen = imagen;
    this.idPais = idPais;
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

  public Long getIdPais() {
    return idPais;
  }

  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  

}
