package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Campeonato;
import sistema.modelos.Time;
import sistema.modelos.Usuario;
import sistema.service.FakeService;

@ManagedBean
public class FakeManagedBean {
	
	private FakeService service = new FakeService();

	public List<Time> getTimes() {
		return service.getTimes();
	}
	
	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}
	
	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}
	
	public List<String> getCidades() {
		return service.getCidades();
	}
	
}
