package titec.proyecto.rest.Mapper;

import java.util.ArrayList;
import java.util.List;

import titec.proyecto.rest.DTO.QueryRecetaDTO.CategoriaQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.ComentarioRecetaDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.ComentarioUsuarioQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.DificultadQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.ImagenQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.RecetaLikeQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.RecetaLikeUsuarioQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.RecetaQueryDTO;
import titec.proyecto.rest.DTO.QueryRecetaDTO.UsuarioRecetaQueryDTO;
import titec.proyecto.rest.Model.RecetaEntities.QueryReceta.ComentarioRecetaQuery;
import titec.proyecto.rest.Model.RecetaEntities.QueryReceta.ImagenQuery;
import titec.proyecto.rest.Model.RecetaEntities.QueryReceta.RecetaLikesQuery;
import titec.proyecto.rest.Model.RecetaEntities.QueryReceta.RecetaQuery;

public class RecetaEspecificoMapper {
  public static RecetaQueryDTO convertToDto(RecetaQuery recetaQuery){
    RecetaQueryDTO recetaQueryDTO = new RecetaQueryDTO();

    recetaQueryDTO.setId(recetaQuery.getId());
    recetaQueryDTO.setTexto(recetaQuery.getTexto());
    recetaQueryDTO.setTitulo(recetaQuery.getTitulo());
    recetaQueryDTO.setFechaPost(recetaQuery.getFechaPost());
    recetaQueryDTO.setFechaEdit(recetaQuery.getFechaEdit());

    recetaQueryDTO.setImagenes(listaImagenesHaciaDTO(recetaQuery.getImagenes()));

    CategoriaQueryDTO categoriaQueryDTO = new CategoriaQueryDTO();

    categoriaQueryDTO.setId(recetaQuery.getCategoria().getId());
    categoriaQueryDTO.setCategoria(recetaQuery.getCategoria().getCategoria());
    recetaQueryDTO.setCategoria(categoriaQueryDTO);

    DificultadQueryDTO dificultadQueryDTO = new DificultadQueryDTO();
    dificultadQueryDTO.setId(recetaQuery.getDificultad().getId());
    dificultadQueryDTO.setDificultad(recetaQuery.getDificultad().getDificultad());
    recetaQueryDTO.setDificultad(dificultadQueryDTO);

    UsuarioRecetaQueryDTO usuarioQueryDTO = new UsuarioRecetaQueryDTO();
    usuarioQueryDTO.setId(recetaQuery.getUsuario().getId());
    usuarioQueryDTO.setUsername(recetaQuery.getUsuario().getUsername());
    usuarioQueryDTO.setNombre(recetaQuery.getUsuario().getNombre());
    usuarioQueryDTO.setApellido(recetaQuery.getUsuario().getApellido());
    recetaQueryDTO.setUsuario(usuarioQueryDTO);

    recetaQueryDTO.setComentarios(comentariosRecetaHaciaDTO(recetaQuery.getComentarios()));

    recetaQueryDTO.setLikes(likesHaciaDTO(recetaQuery.getLikes()));

    recetaQueryDTO.setNumLikes(recetaQuery.getNumLikes());

    return recetaQueryDTO;

  }
  public static List<RecetaLikeQueryDTO> likesHaciaDTO(List<RecetaLikesQuery> likesQuery){
    List<RecetaLikeQueryDTO> likes = new ArrayList<>(likesQuery.size());
    for(RecetaLikesQuery like: likesQuery){
      RecetaLikeQueryDTO likeDTO = new RecetaLikeQueryDTO();
      likeDTO.setId(like.getId());

      RecetaLikeUsuarioQueryDTO usuarioDTO = new RecetaLikeUsuarioQueryDTO();
      usuarioDTO.setId(like.getUsuario().getId());
      usuarioDTO.setUsername(like.getUsuario().getUsername());
      usuarioDTO.setNombre(like.getUsuario().getNombre());
      usuarioDTO.setApellido(like.getUsuario().getApellido());
      likeDTO.setReceta(usuarioDTO);

      likes.add(likeDTO);
      }
    return likes;
  }
  public static List <ComentarioRecetaDTO> comentariosRecetaHaciaDTO(List<ComentarioRecetaQuery> comentariosQuery){
    List<ComentarioRecetaDTO> comentarios = new ArrayList<>(comentariosQuery.size());
    
    for(ComentarioRecetaQuery comentario: comentariosQuery){
      ComentarioRecetaDTO comentarioDTO = new ComentarioRecetaDTO();
      comentarioDTO.setId(comentario.getId());
      comentarioDTO.setFechaCom(comentario.getFechaCom());
      comentarioDTO.setFechaEdit(comentario.getFechaEdit());
      comentarioDTO.setTexto(comentario.getTexto());

      ComentarioUsuarioQueryDTO usuarioDTO = new ComentarioUsuarioQueryDTO();

      usuarioDTO.setId(comentario.getUsuario().getId());
      usuarioDTO.setNombre(comentario.getUsuario().getNombre());
      usuarioDTO.setApellido(comentario.getUsuario().getApellido());
      usuarioDTO.setUsername(comentario.getUsuario().getUsername());
      
      comentarioDTO.setUsuario(usuarioDTO);
      comentarios.add(comentarioDTO);
    }
    return comentarios;

  }


  public static List<ImagenQueryDTO> listaImagenesHaciaDTO(List<ImagenQuery> imagenesQuery){
    List<ImagenQueryDTO> imagenes= new ArrayList<>(imagenesQuery.size());

    for (ImagenQuery imagen: imagenesQuery){
      ImagenQueryDTO imagenDTO = new ImagenQueryDTO();

      imagenDTO.setId(imagen.getId());
      imagenDTO.setSrc(imagen.getSrc());
      imagenes.add(imagenDTO);
    }

    return imagenes;
  }
  
}
