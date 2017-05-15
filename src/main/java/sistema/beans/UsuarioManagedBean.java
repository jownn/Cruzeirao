package sistema.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

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

	/*public String salvar() {
	      	//servico.salvar(usuario);
	  		//usuario = new Usuario();
	         return "inicio.xhtml";
	     }
	 
	 public String voltar(){
		 return "inicio.xhtml";
	 }*/

}
