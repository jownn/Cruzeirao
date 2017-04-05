package sistema.modelos;

import java.util.ArrayList;
import java.util.List;

public class Time {
	
	private Usuario tecnico;
	private Usuario massagista;
	private Usuario auxiliar;
	private Usuario preparadorFisico;
	private Usuario diretor;
	private String nome;
	private Categoria Categoria;
	private String cidade;
	private List<Inscricao> inscricao = new ArrayList<Inscricao>();
	private List<Usuario> jogadores = new ArrayList<Usuario>();
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return Categoria;
	}
	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Inscricao> getInscricao() {
		return inscricao;
	}
	public void addInscricao(Inscricao inscricao) {
		this.inscricao.add(inscricao);
	}
	public List<Usuario> getJogadores() {
		return jogadores;
	}
	public void addJogador(Usuario jogador) {
		jogadores.add(jogador);
	}
	
}
