package sistema.modelos;

import java.util.ArrayList;
import java.util.List;

public class Chave {
	
	private String nome;
	private List<Time> times = new ArrayList<Time>();
	private List<Partida> partidas = new ArrayList<Partida>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Time> getTimes() {
		return times;
	}
	public void addTime(Time time) {
		times.add(time);
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void addPartida(Partida partida) {
		partidas.add(partida);
	}
	
	
}
