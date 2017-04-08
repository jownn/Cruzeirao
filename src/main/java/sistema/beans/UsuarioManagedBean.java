package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Usuario;
import sistema.service.FakeService;
import sistema.service.UsuarioService;

 
@ManagedBean
public class UsuarioManagedBean {
     
	private Usuario usuario = new Usuario();
	private UsuarioService service = new UsuarioService();
	private FakeService fs = new FakeService();
	
	public UsuarioManagedBean(){
		
		service.setUsuarios((ArrayList<Usuario>) fs.getUsuarios());
	}
	
    public String salvar() {
    	service.salvar(usuario);
		usuario = new Usuario();
        return "inicio.xhtml";
    }
    
    public String voltar() {
        return "login.xhtml";
    }
    
    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}

	
}