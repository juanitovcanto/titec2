package titec.proyecto.rest.Controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.DTO.LoginDTO.UserTokenDTO;
import titec.proyecto.rest.DTO.LoginDTO.UsuarioLoginDTO;
import titec.proyecto.rest.Model.LoginEntities.UsuarioLogin;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Service.LoginService;
import titec.proyecto.rest.auth.JwtManager;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthController {
  @Inject
  JwtManager jwtManager;

  @Inject
  private LoginService loginService;

  @POST
  @Path("/registro")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response crearUsuario(Usuario usuario){

    loginService.insertUsuario(usuario);
    return Response.status(201).build();

  }

  @POST
  @Path("/signin")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response postJWT(UsuarioLogin usuarioLogin){
    String[] roles = {"normal"};
    try {
      UsuarioLoginDTO usuario = loginService.authenticate(usuarioLogin.getUsername(), usuarioLogin.getPassword());
      if(usuario != null){
        String token = jwtManager.createJwt(usuario.getUsername(),roles);
        UserTokenDTO userResponse = new UserTokenDTO();
        userResponse.setId(usuario.getId());
        userResponse.setNombre(usuario.getNombre());
        userResponse.setUsername(usuario.getUsername());
        userResponse.setAccessToken(token);
        return Response.ok(userResponse).build();
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return Response.status(Response.Status.UNAUTHORIZED).build();

  }

  

}
