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

@Entity
public class Inscricao implements Serializable {

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero;

	private boolean pagamento;

	private boolean validada;

	@OneToMany(mappedBy="inscricao")
	private List<Inscrito> inscritos = new ArrayList<Inscrito>();

	@ManyToOne
	private Categoria categoria;

	@OneToMany
	private List<Partida> partidas = new ArrayList<Partida>();

	@ManyToOne
	private Equipe equipe;


	//GETTERS AND SETTERS
	public long getNumero() {

		return numero;

	}

	public void setNumero(long numero) {

		this.numero = numero;

	}

	public boolean isPagamento() {

		return pagamento;

	}

	public void setPagamento(boolean pagamento) {

		this.pagamento = pagamento;

	}

	public boolean isValidada() {

		return validada;

	}

	public void setValidada(boolean validada) {

		this.validada = validada;

	}

	public List<Inscrito> getInscritos() {

		return inscritos;

	}

	public void setInscritos(ArrayList<Inscrito> inscritos) {

		this.inscritos = inscritos;

	}

	public Categoria getCategoria() {

		return categoria;

	}

	public void setCategoria(Categoria categoria) {

		this.categoria = categoria;

	}

	public List<Partida> getPartidas() {

		return partidas;

	}

	public void setPartidas(ArrayList<Partida> partidas) {

		this.partidas = partidas;

	}

	public Equipe getEquipe() {

		return equipe;

	}

	public void setEquipe(Equipe equipe) {

		this.equipe = equipe;

	}

}