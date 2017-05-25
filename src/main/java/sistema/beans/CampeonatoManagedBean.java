package sistema.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;

import org.primefaces.event.RowEditEvent;

import sistema.beans.datamodel.CampeonatoDataModel;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.service.CampeonatoService;

@ManagedBean
public class CampeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private Campeonato campeonatoSelecionado;
	private CampeonatoService servico = new CampeonatoService();
	private List<Campeonato> campeonatos;

	/**
	 * @return the campeonatoSelecionado
	 */
	public Campeonato getCampeonatoSelecionado() {
		return campeonatoSelecionado;
	}

	/**
	 * @param campeonatoSelecionado
	 *            the campeonatoSelecionado to set
	 */
	public void setCampeonatoSelecionado(Campeonato campeonatoSelecionado) {
		this.campeonatoSelecionado = campeonatoSelecionado;
	}

	public void salvar() {
		campeonato = servico.salvar(campeonato);

		if (campeonatos != null)
			campeonatos.add(campeonato);

		campeonato = new Campeonato();

	}

	public DataModel<Campeonato> getCampeonatos() {
		if (campeonatos == null)
			campeonatos = servico.getCampeonatos();

		return new CampeonatoDataModel(campeonatos);
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void remove(Campeonato campeonato) {
		if (servico.pesquisarCategoriasCampeonato(campeonato).size() > 0) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Não é possível remover campeonato",
					"Campeonato possui produtos!"));
		} else {
			servico.remover(campeonato);
			campeonatos.remove(campeonato);
		}
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Categoria> getCategoriasCampeonato() {
		if (campeonatoSelecionado != null) {
			return servico.pesquisarCategoriasCampeonato(campeonatoSelecionado);
		} else
			return null;
	}

	public void onRowEdit(RowEditEvent event) {

		Campeonato f = ((Campeonato) event.getObject());
		servico.alterar(f);
	}
	
}
