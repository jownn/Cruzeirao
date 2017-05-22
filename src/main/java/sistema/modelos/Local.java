package sistema.modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local implements Serializable {

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoLocal;

	private String endereco;


	//GETTERS AND SETTERS
	public String getEndereco() {

		return endereco;

	}

	public void setEndereco(String endereco) {

		this.endereco = endereco;

	}

	public int getCodigoLocal() {

		return codigoLocal;

	}

	public void setCodigoLocal(int codigoLocal) {

		this.codigoLocal = codigoLocal;

	}

}
