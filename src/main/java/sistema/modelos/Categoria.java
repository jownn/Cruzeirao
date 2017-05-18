package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import sistema.enums.*;

@Entity
public class Categoria implements Serializable{

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCategoria;

	private String nome;

	private int nascidosApartirDe;

	@OneToMany(mappedBy="categoria")
	private List<Inscricao> inscricoes= new ArrayList<Inscricao>();

	@ManyToOne
	private Campeonato campeonato;

	@OneToMany(mappedBy="categoria")
	private List<Fase> fases =  new ArrayList<Fase>();

	private int minJogadores;

	private int maxJogadores;

	private Sexo sexo; 


	//GETTERS AND SETTERS
	public String getNome() {

		return nome;

	}

	public Sexo getSexo() {

		return sexo;

	}

	public void setSexo(Sexo sexo) {

		this.sexo = sexo;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getNascidosApartirDe() {

		return nascidosApartirDe;

	}

	public void setNascidosApartirDe(int nascidosApartirDe) {

		this.nascidosApartirDe = nascidosApartirDe;

	}

	public List<Inscricao> getInscricoes() {

		return inscricoes;

	}

	public void setInscricoes(ArrayList<Inscricao> inscricoes) {

		this.inscricoes = inscricoes;

	}

	public Campeonato getCampeonato() {

		return campeonato;

	}

	public void setCampeonato(Campeonato campeonato) {

		this.campeonato = campeonato;

	}

	public List<Fase> getFases() {

		return fases;

	}

	public void setFases(ArrayList<Fase> fases) {

		this.fases = fases;

	}

	public int getMinJogadores() {

		return minJogadores;

	}

	public void setMinJogadores(int minJogadores) {

		this.minJogadores = minJogadores;

	}

	public int getMaxJogadores() {

		return maxJogadores;

	}

	public void setMaxJogadores(int maxJogadores) {

		this.maxJogadores = maxJogadores;

	}

}