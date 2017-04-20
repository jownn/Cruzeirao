package sistema.modelos;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.event.FlowEvent;

public class Inscricao {
	
	private Campeonato campeonato;
	private Categoria categoria;
	private boolean status;
	private Image pagamento;
	private Time time;
	private Usuario tecnico;
	private Usuario massagista;
	private Usuario auxiliar;
	private Usuario preparadorFisico;
	private Usuario diretor;
	private List<Usuario> jogadores = new ArrayList<Usuario>();
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Image getPagamento() {
		return pagamento;
	}
	public void setPagamento(Image pagamento) {
		this.pagamento = pagamento;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	public Usuario getTecnico() {
		return tecnico;
	}
	public void setTecnico(Usuario tecnico) {
		this.tecnico = tecnico;
	}
	public Usuario getMassagista() {
		return massagista;
	}
	public void setMassagista(Usuario massagista) {
		this.massagista = massagista;
	}
	public Usuario getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Usuario auxiliar) {
		this.auxiliar = auxiliar;
	}
	public Usuario getPreparadorFisico() {
		return preparadorFisico;
	}
	public void setPreparadorFisico(Usuario preparadorFisico) {
		this.preparadorFisico = preparadorFisico;
	}
	public Usuario getDiretor() {
		return diretor;
	}
	public void setDiretor(Usuario diretor) {
		this.diretor = diretor;
	}
	
	public List<Usuario> getJogadores() {
		return jogadores;
	}
	public void addJogador(Usuario jogador) {
		jogadores.add(jogador);
	}
	
	public String salvar(){
		
		
		return "inscricao.xhtml";
	}
	

	
}
