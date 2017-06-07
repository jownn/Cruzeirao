package sistema.beans;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.interfaces.Cidade;
import sistema.modelos.Campeonato;
import sistema.modelos.Equipe;
import sistema.modelos.Usuario;
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
	
	public List<Equipe> getEquipesDiretor(){
		
		List<Equipe> retorno =  new ArrayList<Equipe>();
		equipes = equiService.getEquipes();
		
		for(Equipe e : equipes)
		{
			for(Usuario u : e.getDiretores()){
				
				if(u.getEmail() != null)
				if(u.getEmail().equals(login.getUsuarioAtual().getEmail()))
					retorno.add(e);
			}
		}
		
		return retorno;
	}
	
	public boolean salvar(){
			equipe.addDiretor(login.getUsuarioAtual());
			equipe.setDataFundacao(new GregorianCalendar().getTime());
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
			equipes = equiService.getEquipes();

		return equipes;
	}

	public void onRowEdit(RowEditEvent event) {

		Equipe p = ((Equipe) event.getObject());
		equiService.alterar(p);
	}
	
}
