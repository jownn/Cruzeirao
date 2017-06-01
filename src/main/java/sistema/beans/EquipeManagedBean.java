package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import sistema.interfaces.Cidade;
import sistema.modelos.Equipe;
import sistema.service.CategoriaService;
import sistema.service.EquipeService;

@ManagedBean(name = "equipeManagedBean")
@ViewScoped
public class EquipeManagedBean {

	private Equipe equipe = new Equipe();
	private EquipeService equiService = new EquipeService();
	@ManagedProperty(value="#{loginManagedBean}")
	private LoginManagedBean login;
	
	public void setLogin(LoginManagedBean login) {
		this.login = login;
	}
	
	public boolean salvar(){
		System.out.println(login.getUsuarioAtual().getEmail());
		
		return false;
	}
	
	public List<String> getCidades() {
		return new Cidade().getCidades();
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
}
