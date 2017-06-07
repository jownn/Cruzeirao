package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import org.primefaces.event.RowEditEvent;
import sistema.beans.datamodel.InscricaoDataModel;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Inscricao;
import sistema.service.InscricaoService;

@ManagedBean(name = "inscricaoManagedBean")
@ViewScoped
public class InscricaoManagedBean {
	
	private Inscricao inscricao = new Inscricao();
	private Inscricao inscricaoSelecionado;
	private Categoria categoriaSelecionado;
	private Campeonato campeonatoSelecionado;
	private InscricaoService servico = new InscricaoService();
	private List<Inscricao> inscricoes;

	
	
	public Categoria getCategoriaSelecionado() {
		return categoriaSelecionado;
	}

	public void setCategoriaSelecionado(Categoria categoriaSelecionado) {
		this.categoriaSelecionado = categoriaSelecionado;
	}

	public Campeonato getCampeonatoSelecionado() {
		return campeonatoSelecionado;
	}

	public void setCampeonatoSelecionado(Campeonato campeonatoSelecionado) {
		this.campeonatoSelecionado = campeonatoSelecionado;
	}

	/**
	 * @return the inscricaoSelecionado
	 */
	public Inscricao getInscricaoSelecionado() {
		return inscricaoSelecionado;
	}

	/**
	 * @param inscricaoSelecionado
	 *            the inscricaoSelecionado to set
	 */
	public void setInscricaoSelecionado(Inscricao inscricaoSelecionado) {
		this.inscricaoSelecionado = inscricaoSelecionado;
	}

	public void salvar() {
		inscricao = servico.salvar(inscricao);

		if (inscricoes != null)
			inscricoes.add(inscricao);

		inscricao = new Inscricao();

	}

	public DataModel<Inscricao> getInscricoes() {
		if (inscricoes == null)
			inscricoes = servico.getInscricoes();

		return new InscricaoDataModel(inscricoes);
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void remove(Inscricao inscricao) {
			servico.remover(inscricao);
			inscricoes.remove(inscricao);
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public void onRowEdit(RowEditEvent event) {

		Inscricao f = ((Inscricao) event.getObject());
		servico.alterar(f);
	}
}
