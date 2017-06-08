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
	
	public List<Usuario> getUsuarios(){
		return servico.getUsuarios();
	}

	public String salvar() {
			usuario.setTipo(TipoUsuario.NORMAL);
	      	usuario = servico.salvar(usuario);
	  		usuario = new Usuario();
	  		
	  		
	  		
	        return "login.xhtml";
	     }
	
	
	 public String voltar(){
		 return "login.xhtml";
	 }

}
