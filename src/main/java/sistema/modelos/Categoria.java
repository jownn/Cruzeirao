package sistema.modelos;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private int anoMin;
	private char sexo;
	private boolean habCadTime;
	private boolean habCadJog;
	private List<Inscricao> inscricao = new ArrayList<Inscricao>();
	private String nome;
	private Campeonato campeonato;
	private List<Chave> chaves = new ArrayList<Chave>();
	private boolean status;
	
	public int getAnoMin() {
		return anoMin;
	}
	public void setAnoMin(int anoMin) {
		this.anoMin = anoMin;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isHabCadTime() {
		return habCadTime;
	}
	public void setHabCadTime(boolean habCadTime) {
		this.habCadTime = habCadTime;
	}
	public boolean isHabCadJog() {
		return habCadJog;
	}
	public void setHabCadJog(boolean habCadJog) {
		this.habCadJog = habCadJog;
	}
	public List<Inscricao> getInscricao() {
		return inscricao;
	}
	public void addInscricao(Inscricao inscricao) {
		this.inscricao.add(inscricao);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public List<Chave> getChaves() {
		return chaves;
	}
	public void addChave(Chave chave) {
		chaves.add(chave);
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
