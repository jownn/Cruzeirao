package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Campeonato;

public class CampeonatoService {

	private ArrayList <Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}


	public void salvar(Campeonato campeonato)
	{
	    campeonatos.add(campeonato);
	}
	

	public List <Campeonato> getCampeonatos()
	{	
		return campeonatos;	
	}
	
}
