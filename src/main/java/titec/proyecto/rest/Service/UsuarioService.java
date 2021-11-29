package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;

@Local
public interface UsuarioService {

  Usuario findById(Long id);

  void insertUsuario(Usuario usuario);

  void removeUsuario(Long id);

  void updateUsuario(Usuario usuario);



}
