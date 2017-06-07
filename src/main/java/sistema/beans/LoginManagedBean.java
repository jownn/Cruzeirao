package sistema.beans;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean(name="loginManagedBean")
@SessionScoped
public class LoginManagedBean implements Serializable {
	private Usuario usuarioAtual = new Usuario();
	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}


	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}


	private UsuarioService servico = new UsuarioService();
	
	
	public String login() {
		List<Usuario> usuarios;
		
      	usuarios = servico.getUsuarios();
      	Usuario a;
      	Iterator<Usuario> it = usuarios.iterator();	
      	
      	while(it.hasNext())
      	{
      		a = it.next();
      		if(a.getEmail().equals(usuarioAtual.getEmail()))
      		{
      			if(a.getSenha().equals(usuarioAtual.getSenha()))
      			{
      			 return "inicio.xhtml";
      			}
      			else{
      				System.out.println("Deu um break");
      				break;
      			}
      		}
      			
      			
      	}
      	
      	 usuarioAtual = new Usuario();
         return "login.xhtml";
     }

}