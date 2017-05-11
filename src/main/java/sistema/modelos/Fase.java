package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import enums.Formato;

@Entity
public class Fase implements Serializable{

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoFase;

	@Temporal(TemporalType.DATE)
	private Date dataInicio;

	@Temporal(TemporalType.DATE)
	private Date dataFim;

	private Formato formato;
	 

	@ManyToOne
	private Categoria categoria;

	@OneToMany(mappedBy="fase")
	private ArrayList<Grupo> grupos= new ArrayList<Grupo>();

	private int numero;

	//GETTERS AND SETTERS
	public Date getDataInicio() {

		return dataInicio;

	}

	public void setDataInicio(Date dataInicio) {

		this.dataInicio = dataInicio;

	}

	public Date getDataFim() {

		return dataFim;

	}

	public void setDataFim(Date dataFim) {

		this.dataFim = dataFim;

	}

	public Categoria getCategoria() {

		return categoria;

	}

	public void setCategoria(Categoria categoria) {

		this.categoria = categoria;

	}

	public ArrayList<Grupo> getGrupos() {

		return grupos;

	}

	public void setGrupos(ArrayList<Grupo> grupos) {

		this.grupos = grupos;

	}

	public int getNumero() {

		return numero;

	}

	public void setNumero(int numero) {

		this.numero = numero;

	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
}
