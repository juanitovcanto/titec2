package titec.proyecto.rest.Mapper;

import titec.proyecto.rest.DTO.LoginDTO.TipoUsuarioDTO;
import titec.proyecto.rest.DTO.LoginDTO.UsuarioLoginDTO;
import titec.proyecto.rest.Model.LoginEntities.UsuarioLogin;

public class LoginMapper {
  public static UsuarioLoginDTO convertToDTO(UsuarioLogin loginQuery){
    UsuarioLoginDTO loginDTO = new UsuarioLoginDTO();
    loginDTO.setId(loginQuery.getId());
    loginDTO.setUsername(loginQuery.getUsername());
    loginDTO.setPassword(loginQuery.getPassword());
    loginDTO.setNombre(loginQuery.getNombre());

    TipoUsuarioDTO tipoDTO = new TipoUsuarioDTO();
    tipoDTO.setId(loginQuery.getTipo().getId());
    tipoDTO.setTipoUsuario(loginQuery.getTipo().getTipoUsuario());

    loginDTO.setTipo(tipoDTO);
    return loginDTO;
  }
}
