package sistema.beans;

import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.enums.TipoUsuario;
import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean {
	private Usuario usuario = new Usuario();
	private UsuarioService servico = new UsuarioService();
	private List<Usuario> usuarios;

	public UsuarioManagedBean(){}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Usuario> getAlunos() {
		if (usuarios == null)
			usuarios = servico.getUsuarios();

		return usuarios;
	}

	public String salvar() {
			usuario.setTipo(TipoUsuario.NORMAL);
	      	servico.salvar(usuario);
	  		usuario = new Usuario();
	         return "inicio.xhtml";
	     }
	 
	
	public String login() {
      	usuarios = servico.getUsuarios();
      	Usuario a;
      	Iterator<Usuario> it = usuarios.iterator();		
      	
      	while(it.hasNext())
      	{
      		a = it.next();
      		if(a.getEmail().equals(usuario.getEmail()))
      		{
      			if(a.getSenha().equals(usuario.getSenha()))
      			{
      			 usuario = new Usuario();
      			 return "inicio.xhtml";
      			}
      			else{
      				System.out.println("Deu um break");
      				break;
      			}
      		}
      			
      			
      	}
      	
  		usuario = new Usuario();
         return "login.xhtml";
     }
	
	 public String voltar(){
		 return "login.xhtml";
	 }

}
