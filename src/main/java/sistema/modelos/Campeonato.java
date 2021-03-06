package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Campeonato implements Serializable{

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCampeonato;

	private String nome;
	
	@OneToMany
	private List<Local> locais = new ArrayList<Local>();

	//@OneToMany
	@ManyToMany
	private List<Juiz> juizes= new ArrayList<Juiz>();

	@OneToMany(mappedBy="campeonato")
	private List<Categoria> categorias= new ArrayList<Categoria>();

	@Temporal(TemporalType.DATE)
	private Date  dataInicioInscricao;

	@Temporal(TemporalType.DATE)
	private Date dataFimInscricao;

	@Temporal(TemporalType.DATE)
	private Date dataInicioCampeonato;

	@Temporal(TemporalType.DATE)
	private Date dataFimCampeonato;

	private double valorTaxa;

	//GETTERS AND SETTERS
	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public List<Local> getLocais() {

		return locais;

	}

	public void setLocais(ArrayList<Local> locais) {

		this.locais = locais;

	}

	public List<Juiz> getJuizes() {

		return juizes;

	}

	public void setJuizes(ArrayList<Juiz> juizes) {

		this.juizes = juizes;

	}
	
	public void addCategoria(Categoria categoria){
		categorias.add(categoria);
	}
	
	public List<Categoria> getCategorias() {

		return categorias;

	}

	public void setCategorias(ArrayList<Categoria> categorias) {

		this.categorias = categorias;

	}

	public Date getDataInicioInscricao() {

		return dataInicioInscricao;

	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {

		this.dataInicioInscricao = dataInicioInscricao;

	}

	public Date getDataFimInscricao() {

		return dataFimInscricao;

	}

	public void setDataFimInscricao(Date dataFimInscricao) {

		this.dataFimInscricao = dataFimInscricao;

	}

	public Date getDataInicioCampeonato() {

		return dataInicioCampeonato;

	}

	public void setDataInicioCampeonato(Date dataInicioCampeonato) {

		this.dataInicioCampeonato = dataInicioCampeonato;

	}

	public Date getDataFimCampeonato() {

		return dataFimCampeonato;

	}

	public void setDataFimCampeonato(Date dataFimCampeonato) {

		this.dataFimCampeonato = dataFimCampeonato;

	}

	public double getValorTaxa() {

		return valorTaxa;

	}

	public void setValorTaxa(double valorTaxa) {

		this.valorTaxa = valorTaxa;

	}

	public int getCodigoCampeonato() {

		return codigoCampeonato;

	}

	public void setCodigoCampeonato(int codigoCampeonato) {

		this.codigoCampeonato = codigoCampeonato;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campeonato other = (Campeonato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	

	
}