package titec.proyecto.rest.Model;
import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CATEGORIA",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "CATEGORIA")
    private String categoria;

    public Categoria() {
    }

    public Categoria(long id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
