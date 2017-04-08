package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;
import sistema.service.FakeService;

@ManagedBean
public class CampeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private CampeonatoService service = new CampeonatoService();
    private FakeService fs = new FakeService();
    
    public CampeonatoManagedBean(){
    	
    	service.setCampeonatos((ArrayList<Campeonato>) fs.getCampeonatos());
    	
    }
    
    
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
