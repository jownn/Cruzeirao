package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

@ManagedBean
public class CampeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private CampeonatoService service = new CampeonatoService();
    
    public String salvar() {
    	service.salvar(campeonato);
		campeonato = new Campeonato();
        return "cadastroCampeonato.xhtml";
    }
    
    public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}
	
}
