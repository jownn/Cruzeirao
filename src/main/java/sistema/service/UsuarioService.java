package sistema.service;

import java.util.List;
import sistema.dao.UsuarioDAO;
import sistema.modelos.Usuario;

public class UsuarioService {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public Usuario salvar(Usuario usuario) {
		
		usuario = usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}

	public List<Usuario> getUsuarios() {
		List <Usuario> list = usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
}
