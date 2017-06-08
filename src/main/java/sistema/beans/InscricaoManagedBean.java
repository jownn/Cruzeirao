package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.persistence.criteria.CriteriaBuilder.In;

import org.primefaces.event.RowEditEvent;
import sistema.beans.datamodel.InscricaoDataModel;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Equipe;
import sistema.modelos.Inscricao;
import sistema.service.InscricaoService;

@ManagedBean(name = "inscricaoManagedBean")
@ViewScoped
public class InscricaoManagedBean {
	
	private Inscricao inscricao = new Inscricao();
	private Inscricao inscricaoSelecionado;
	private Equipe equipeSelecionada;
	private Categoria categoriaSelecionado;
	private Campeonato campeonatoSelecionado;
	private InscricaoService servico = new InscricaoService();
	private List<Inscricao> inscricoes;
	
	@ManagedProperty(value="#{loginManagedBean}")
	private LoginManagedBean login;
	
	
	public LoginManagedBean getLogin() {
		return login;
	}

	public void setLogin(LoginManagedBean login) {
		this.login = login;
	}

	public Categoria getCategoriaSelecionado() {
		return categoriaSelecionado;
	}

	public void setCategoriaSelecionado(Categoria categoriaSelecionado) {
		this.categoriaSelecionado = categoriaSelecionado;
	}
	
	public void Confirma(){
		//inscricao.setCategoria(categoriaSelecionada);
		//inscricao.setEquipe(equipe);
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

	public Equipe getEquipeSelecionada() {
		return equipeSelecionada;
	}

	public void setEquipeSelecionada(Equipe equipeSelecionada) {
		this.equipeSelecionada = equipeSelecionada;
	}
	
	public void preInscricao(){
		inscricao.setCategoria(categoriaSelecionado);
		inscricao.setEquipe(equipeSelecionada);
		inscricao.setValidada(false);

		servico.salvar(inscricao);
		
		if(inscricoes != null)
			inscricoes.add(inscricao);
		
		inscricao = new Inscricao();
	}
	
	public List<Inscricao> getInscricoesRealizadas(){
		List<Inscricao> ins = servico.getInscricoes();
		List<Inscricao> retorno = new ArrayList<Inscricao>();
		
		for (Inscricao inscricao : ins) {
			if(inscricao.getEquipe().isDiretor(login.getUsuarioAtual()))
				retorno.add(inscricao);
		
		}
		
		
		return retorno;
		
	}
}
