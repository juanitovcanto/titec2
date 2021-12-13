package titec.proyecto.rest.Controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.DTO.LoginDTO.UsuarioLoginDTO;
import titec.proyecto.rest.Model.LoginEntities.Jwt;
import titec.proyecto.rest.Model.UsuarioEntities.CreacionUsuario.Usuario;
import titec.proyecto.rest.Service.LoginService;
import titec.proyecto.rest.auth.JwtManager;

@Path("/login")
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
  @Path("/token")
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  public Response postJWT(@FormParam("username") String username, @FormParam("password") String password){
    String[] roles = {"normal"};
    try {
      UsuarioLoginDTO usuario = loginService.authenticate(username, password);
      if(usuario != null){
        String token = jwtManager.createJwt(usuario.getUsername(),roles);
        return Response.ok(new Jwt(token)).build();
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return Response.status(Response.Status.UNAUTHORIZED).build();

  }

  

}
