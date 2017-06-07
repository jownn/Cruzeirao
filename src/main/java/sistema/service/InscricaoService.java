package sistema.service;

import java.util.List;

import sistema.dao.InscricaoDAO;
import sistema.modelos.Inscricao;

public class InscricaoService {

	private InscricaoDAO inscricaoDAO = new InscricaoDAO();

	public Inscricao salvar(Inscricao inscricao) {

		inscricao = inscricaoDAO.save(inscricao);
		inscricaoDAO.closeEntityManager();
		return inscricao;
	}

	public List<Inscricao> getInscricoes() {
		List<Inscricao> list = inscricaoDAO.getAll(Inscricao.class);
		inscricaoDAO.closeEntityManager();
		return list;
	}

	public void alterar(Inscricao inscricao) {

		inscricaoDAO.save(inscricao);
		inscricaoDAO.closeEntityManager();

	}

	public void remover(Inscricao inscricao) {

		inscricao = inscricaoDAO.getById(Inscricao.class, inscricao.getNumero());
		inscricaoDAO.remove(inscricao);
		inscricaoDAO.closeEntityManager();
	}

	public Inscricao pesquisar(Inscricao inscricao) {

		inscricao = inscricaoDAO.getById(Inscricao.class, inscricao.getNumero());
		inscricaoDAO.closeEntityManager();
		return inscricao;
	}

	
}
