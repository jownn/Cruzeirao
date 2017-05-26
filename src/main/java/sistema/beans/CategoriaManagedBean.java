package sistema.beans;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.enums.Sexo;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.service.CampeonatoService;
import sistema.service.CategoriaService;

@ManagedBean(name = "categoriaManagedBean")
@ViewScoped
public class CategoriaManagedBean {

	private Categoria categoria = new Categoria();
	private Campeonato campeonato;
	private CategoriaService catService = new CategoriaService();
	private CampeonatoService campService = new CampeonatoService();
	private List<Categoria> categorias;

	public void salvar() {
		campeonato.addCategoria(categoria);
		categoria.setCampeonato(campeonato);

		categoria = catService.salvar(categoria);

		if (categorias != null)
			categorias.add(categoria);

		categoria = new Categoria();
		campeonato = null;

	}

	public List<Sexo> getSexo()
	{
		return Arrays.asList(Sexo.values());
	}
	
	public List<Campeonato> getCampeonatos() {
		return campService.getCampeonatos();

	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void remove(Categoria categoria) {
		catService.remover(categoria);
		categorias.remove(categoria);
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		if (categorias == null)
			categorias = catService.getCategorias();

		return categorias;
	}

	public void onRowEdit(RowEditEvent event) {

		Categoria p = ((Categoria) event.getObject());
		catService.alterar(p);
	}

}
