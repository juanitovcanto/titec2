package titec.proyecto.rest.Service;

import javax.ejb.Local;
import titec.proyecto.rest.Model.EntitiesFollow.UsuarioFollow;

@Local
public interface FollowService {

    void insert(long id,long id_seguidor);

}

