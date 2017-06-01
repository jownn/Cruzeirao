package sistema.service;

import java.util.List;
import sistema.dao.CampeonatoDAO;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;

public class CampeonatoService {

	private CampeonatoDAO campeonatoDAO = new CampeonatoDAO();

	public Campeonato salvar(Campeonato campeonato) {

		campeonato = campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}

	public void alterar(Campeonato campeonato) {

		campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();

	}

	public void remover(Campeonato campeonato) {

		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getCodigoCampeonato());
		campeonatoDAO.remove(campeonato);
		campeonatoDAO.closeEntityManager();
	}

	public Campeonato pesquisar(Campeonato campeonato) {

		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getCodigoCampeonato());
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}

	public List<Categoria> pesquisarCategoriasCampeonato(Campeonato campeonato) {

		List<Categoria> categorias;

		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getCodigoCampeonato());
		categorias = campeonato.getCategorias();

		return categorias;
	}

}
