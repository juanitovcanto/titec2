package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.UsuarioUpdate;

@Local
public interface UsuarioService {

  Usuario findById(Long id);

  void insertUsuario(Usuario usuario);

  void removeUsuario(Long id);

  void updateUsuario(UsuarioUpdate usuario);



}
