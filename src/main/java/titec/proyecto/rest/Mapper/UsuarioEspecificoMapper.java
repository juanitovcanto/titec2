package titec.proyecto.rest.Mapper;


import titec.proyecto.rest.DTO.QueryUsuarioDTO.PaisesEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.PerfilEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.UsuarioEspecificoDTO;
import titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario.UsuarioEspecifico;

public class UsuarioEspecificoMapper {
  public static UsuarioEspecificoDTO convertToDTO(UsuarioEspecifico usuarioQuery){

    UsuarioEspecificoDTO usuarioEspecificoDTO = new UsuarioEspecificoDTO();

    usuarioEspecificoDTO.setId(usuarioQuery.getId());
    usuarioEspecificoDTO.setNombre(usuarioQuery.getNombre());
    usuarioEspecificoDTO.setApellido(usuarioQuery.getApellido());
    usuarioEspecificoDTO.setUsername(usuarioQuery.getUsername());
    usuarioEspecificoDTO.setEmail(usuarioQuery.getEmail());

    PerfilEspecificoDTO perfilEspecificoDTO = new PerfilEspecificoDTO();

    perfilEspecificoDTO.setId(usuarioQuery.getPerfil().getId());
    perfilEspecificoDTO.setBiografia(usuarioQuery.getPerfil().getBiografia());
    perfilEspecificoDTO.setFecha(usuarioQuery.getPerfil().getFecha());
    perfilEspecificoDTO.setImagen(usuarioQuery.getPerfil().getImagen());

    PaisesEspecificoDTO paisesEspecificoDTO = new PaisesEspecificoDTO();

    paisesEspecificoDTO.setId(usuarioQuery.getPerfil().getPais().getId());
    paisesEspecificoDTO.setPais(usuarioQuery.getPerfil().getPais().getPais());

    perfilEspecificoDTO.setPais(paisesEspecificoDTO);
    usuarioEspecificoDTO.setPerfil(perfilEspecificoDTO);

    return usuarioEspecificoDTO;



    

    


  }
  
}
