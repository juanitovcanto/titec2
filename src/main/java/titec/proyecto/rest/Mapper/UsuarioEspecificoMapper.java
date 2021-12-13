package titec.proyecto.rest.Mapper;


import java.util.ArrayList;
import java.util.List;

import titec.proyecto.rest.DTO.QueryUsuarioDTO.DificultadUsuarioEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.FollowUsuarioEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.PaisesEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.PerfilEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.RecetaDeUsuarioEspecificoDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.RecetaDeUsuarioEspecificoImagenDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.SeguidoresQueryDTO;
import titec.proyecto.rest.DTO.QueryUsuarioDTO.UsuarioEspecificoDTO;
import titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario.FollowUsuarioEspecifico;
import titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario.RecetaDeUsuarioEspecifico;
import titec.proyecto.rest.Model.UsuarioEntities.QueryUsuario.RecetaDeUsuarioEspecificoImagen;
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

    usuarioEspecificoDTO.setFollowers(seguidoresHaciaDTO(usuarioQuery.getFollowers()));
    usuarioEspecificoDTO.setNumFollowers(usuarioQuery.getNumFollowers());

    usuarioEspecificoDTO.setRecetas(recetasHaciaDTO(usuarioQuery.getRecetas()));

    return usuarioEspecificoDTO;

    }

  public static List<RecetaDeUsuarioEspecificoDTO> recetasHaciaDTO(List<RecetaDeUsuarioEspecifico> recetasQuery){
    List<RecetaDeUsuarioEspecificoDTO> recetas = new ArrayList<>(recetasQuery.size());

    for (RecetaDeUsuarioEspecifico receta: recetasQuery){
      RecetaDeUsuarioEspecificoDTO recetaDTO = new RecetaDeUsuarioEspecificoDTO();

      recetaDTO.setId(receta.getId());
      recetaDTO.setTitulo(receta.getTitulo());
      recetaDTO.setFechaPost(receta.getFechaPost());

      //imagenDTO.setId(receta.getImagen().getId());
      //imagenDTO.setSrc(receta.getImagen().getSrc());

      //recetaDTO.setImagen(imagenDTO);
      recetaDTO.setImagen(imagenHaciaDTO(receta.getImagen()));

      DificultadUsuarioEspecificoDTO dificultadDTO = new DificultadUsuarioEspecificoDTO();
      dificultadDTO.setId(receta.getDificultad().getId());
      dificultadDTO.setDificultad(receta.getDificultad().getDificultad());
      recetaDTO.setDificultad(dificultadDTO);

      recetas.add(recetaDTO);
    } 
    return recetas;

  }
  public static List <RecetaDeUsuarioEspecificoImagenDTO> imagenHaciaDTO(List<RecetaDeUsuarioEspecificoImagen> imagenQuery){
    List<RecetaDeUsuarioEspecificoImagenDTO> imagenes = new ArrayList<>(imagenQuery.size());
    
    for (RecetaDeUsuarioEspecificoImagen imagen: imagenQuery){
      RecetaDeUsuarioEspecificoImagenDTO imageneDTO = new RecetaDeUsuarioEspecificoImagenDTO();
      imageneDTO.setId(imagen.getId());
      imageneDTO.setSrc(imagen.getSrc());
      imageneDTO.setImagenPrincipal(imagen.getImagenPrincipal());

      imagenes.add(imageneDTO);
    }
    return imagenes;
  }

  public static List<FollowUsuarioEspecificoDTO> seguidoresHaciaDTO(List<FollowUsuarioEspecifico> followersQuery) {

    List<FollowUsuarioEspecificoDTO> followers = new ArrayList<>(followersQuery.size());

    for (FollowUsuarioEspecifico follow: followersQuery){
      FollowUsuarioEspecificoDTO followDTO = new FollowUsuarioEspecificoDTO();

      followDTO.setId(follow.getId());

      SeguidoresQueryDTO seguidor = new SeguidoresQueryDTO();
      seguidor.setId(follow.getSeguido().getId());
      seguidor.setNombre(follow.getSeguido().getNombre());
      seguidor.setApellido(follow.getSeguido().getApellido());
      seguidor.setUsername(follow.getSeguido().getUsername());

      followDTO.setSeguidor(seguidor);

      followers.add(followDTO);

    }
    return followers;


    
  }


  
}
