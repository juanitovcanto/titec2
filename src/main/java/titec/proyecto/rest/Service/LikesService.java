package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.Model.LikeEntities.CreacionLikes.Likes;

@Local
public interface LikesService {

  void insert(Likes likes);
}
