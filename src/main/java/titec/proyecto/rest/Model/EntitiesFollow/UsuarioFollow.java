package titec.proyecto.rest.Model.EntitiesFollow;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class UsuarioFollow implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @ManyToMany
    @JoinTable(name = "FOLLOW",
                joinColumns = @JoinColumn(name = "ID_SEGUIDOR"),
                inverseJoinColumns = @JoinColumn(name = "ID_SEGUIDO"))   
    private List<UsuarioFollow> seguidor;

    @ManyToMany
    @JoinTable(name = "FOLLOW",
                joinColumns = @JoinColumn(name = "ID_SEGUIDO"),
                inverseJoinColumns = @JoinColumn(name = "ID_SEGUIDOR"))   
    private List<UsuarioFollow> seguido;

    public void addUsuario(UsuarioFollow usuario){
        seguidor.add(usuario);
    }

    public UsuarioFollow() {
    }

    public UsuarioFollow(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<UsuarioFollow> getSeguidor() {
        return seguidor;
    }

    public void setSeguidor(List<UsuarioFollow> seguidor) {
        this.seguidor = seguidor;
    }

    public List<UsuarioFollow> getSeguido() {
        return seguido;
    }

    public void setSeguido(List<UsuarioFollow> seguido) {
        this.seguido = seguido;
    }

    
}