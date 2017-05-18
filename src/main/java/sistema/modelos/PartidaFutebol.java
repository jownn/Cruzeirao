package sistema.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

//DUVIDAS NESSA CLASSE SOBRE COMO PERSISRTIR UMA HERANÇA


public class PartidaFutebol{

	//ATRIBUTOS
	@OneToMany( targetEntity=Gol.class )
	private List<Gol> golsMandantes= new ArrayList<Gol>();

	@OneToMany( targetEntity=Gol.class )
	private List<Gol> golsVisitantes = new ArrayList<Gol>();

	@OneToMany( targetEntity=Cartao.class )
	private List<Cartao> cartoesMandante = new ArrayList<Cartao>();

	@OneToMany( targetEntity=Cartao.class )
	private List<Cartao> cartoesVisitante = new ArrayList<Cartao>();

	public List<Gol> golsPenaliMandante() {

		List<Gol> result = new ArrayList<Gol>();

		for (Gol gol : golsMandantes) {

			if(gol.isPenalti())

				result.add(gol);

		}

		return result;

	}	

	public ArrayList<Gol> golsPenaliVisitante() {

		ArrayList<Gol> result = new ArrayList<Gol>();

		for (Gol gol : golsVisitantes) {

			if(gol.isPenalti())

				result.add(gol);

		}

		return result;

	}	

	//GETTERS AND SETTERS
	public List<Gol> getGolsMandantes() {

		return golsMandantes;

	}

	public void setGolsMandantes(List<Gol> golsMandantes) {

		this.golsMandantes = golsMandantes;

	}

	public List<Gol> getGolsVisitantes() {

		return golsVisitantes;

	}

	public void setGolsVisitantes(ArrayList<Gol> golsVisitantes) {

		this.golsVisitantes = golsVisitantes;

	}

	public List<Cartao> getCartoesMandante() {

		return cartoesMandante;

	}

	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {

		this.cartoesMandante = cartoesMandante;

	}

	public List<Cartao> getCartoesVisitante() {

		return cartoesVisitante;

	}

	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {

		this.cartoesVisitante = cartoesVisitante;

	}

}