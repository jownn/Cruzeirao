package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.interfaces.Cidade;
import sistema.modelos.Campeonato;
import sistema.modelos.Equipe;
import sistema.modelos.Equipe;
import sistema.service.EquipeService;
import sistema.service.EquipeService;

@ManagedBean(name = "equipeManagedBean")
@ViewScoped
public class EquipeManagedBean {

	private Equipe equipe = new Equipe();
	private EquipeService equiService = new EquipeService();
	@ManagedProperty(value="#{loginManagedBean}")
	private LoginManagedBean login;
	private List<Equipe> equipes;
	
	public void setLogin(LoginManagedBean login) {
		this.login = login;
	}
	
	public boolean salvar(){
			equipe.addDiretor(login.getUsuarioAtual());
			
			equipe = equiService.salvar(equipe);
			
			if(equipe != null)
				equipes.add(equipe);
			
			equipe = new Equipe();
			
			return true;
	}
	
	public List<String> getCidades() {
		return new Cidade().getCidades();
	}
	

	public void remove(Equipe equipe) {
		equiService.remover(equipe);
		equipes.remove(equipe);
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Equipe> getEquipes() {
		if (equipes == null)
			equipes = equiService.getEquipes();

		return equipes;
	}

	public void onRowEdit(RowEditEvent event) {

		Equipe p = ((Equipe) event.getObject());
		equiService.alterar(p);
	}
	
}
