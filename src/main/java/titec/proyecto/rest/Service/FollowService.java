package titec.proyecto.rest.Service;

import javax.ejb.Local;

import titec.proyecto.rest.Model.FollowEntities.CreacionFollow.Follow;

@Local
public interface FollowService {

    void insert(Follow follow);

}

