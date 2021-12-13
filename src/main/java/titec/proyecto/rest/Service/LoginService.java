package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.DTO.LoginDTO.UsuarioLoginDTO;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;

@Local
public interface LoginService {

  UsuarioLoginDTO authenticate(String username,String password) throws Exception;

  void insertUsuario(Usuario usuario);

  
}
