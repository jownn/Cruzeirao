package sistema.modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import enums.TipoJuiz;

@Entity
public class Juiz implements Serializable {

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	private TipoJuiz tipo;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoJuiz;

	private Usuario usuario;


	//GETTERS AND SETTERS
	public Usuario getUsuario() {

		return usuario;

	}

	public void setUsuario(Usuario usuario) {

		this.usuario = usuario;

	}

	public int getCodigoJuiz() {

		return codigoJuiz;

	}

	public void setCodigoJuiz(int codigoJuiz) {

		this.codigoJuiz = codigoJuiz;

	}

	public TipoJuiz getTipo() {
		return tipo;
	}

	public void setTipo(TipoJuiz tipo) {
		this.tipo = tipo;
	}
	

}
