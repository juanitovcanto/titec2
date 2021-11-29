package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.DTO.QueryUsuarioDTO.UsuarioEspecificoDTO;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.UsuarioUpdate;

@Local
public interface UsuarioService {

  UsuarioEspecificoDTO findById(Long id);

  void insertUsuario(Usuario usuario);

  void removeUsuario(Long id);

  void updateUsuario(UsuarioUpdate usuario);



}
