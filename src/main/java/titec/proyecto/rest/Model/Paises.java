package titec.proyecto.rest.Model;
import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PAIS",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Paises implements Serializable{
    private static final long serialVersionUID = 1L;


    @Id
    private long id;

    @Column(name = "NOMBRE")
    private String pais;

    public Paises() {
    }

    public Paises(long id, String pais) {
        this.id = id;
        this.pais = pais;
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



}
