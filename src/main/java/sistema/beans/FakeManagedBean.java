/*package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Inscricao;
import sistema.modelos.Time;
import sistema.modelos.Usuario;
import sistema.service.FakeService;

@ManagedBean
@SessionScoped
public class FakeManagedBean {
	
	private FakeService service = new FakeService();
	private Time selectedTime = new Time();
	private Campeonato selectedCampeonato = new Campeonato();
	private Usuario selectedUsuario = new Usuario();
	private Categoria selectedCategoria = new Categoria();
	private Inscricao selectedInscricao = new Inscricao();
	
	public List<Time> getTimes() {
		return service.getTimes();
	}
	
	public Time getSelectedTime() {
        return selectedTime;
    }
	
	public void setSelectedTime(Time selectedTime) {
		this.selectedTime = selectedTime;
	}
	
	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}
	
	public Campeonato getSelectedCampeonato() {
		return selectedCampeonato;
	}

	public void setSelectedCampeonato(Campeonato selectedCampeonato) {
		this.selectedCampeonato = selectedCampeonato;
	}
	
	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}
	
	public Usuario getSelectedUsuario() {
		return selectedUsuario;
	}

	public void setSelectedUsuario(Usuario selectedUsuario) {
		this.selectedUsuario = selectedUsuario;
	}
	
	public List<String> getCidades() {
		return service.getCidades();
	}
	
	public List<Categoria> getCategorias() {
		return service.getCategorias();
	}

	public Categoria getSelectedCategoria() {
		return selectedCategoria;
	}

	public void setSelectedCategoria(Categoria selectedCategoria) {
		this.selectedCategoria = selectedCategoria;
	}

	public Inscricao getSelectedInscricao() {
		return selectedInscricao;
	}

	public void setSelectedInscricao(Inscricao selectedInscricao) {
		this.selectedInscricao = selectedInscricao;
	}
    
	
}
*/