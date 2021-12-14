package titec.proyecto.rest.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DIFICULTAD",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Dificultad implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column(name = "DIFICULTAD")
  private String dificultad;


  public Dificultad() {
  }


  public Dificultad(Long id, String dificultad) {
    this.id = id;
    this.dificultad = dificultad;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDificultad() {
    return dificultad;
  }

  public void setDificultad(String dificultad) {
    this.dificultad = dificultad;
  }

  
  
}
