package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.Model.ComentarioEntities.Comentario;

@Local
public interface ComentarioService {
  void insertComentario(Comentario comentario);
}
