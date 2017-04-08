package sistema.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Time;
import sistema.modelos.Usuario;

public class FakeService {

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	private ArrayList<Time> times = new ArrayList<Time>();
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public List<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	
	@SuppressWarnings("deprecation")
	public FakeService(){
		
		Campeonato camp = new Campeonato();
		
		camp.setAno(2017);
		camp.setDataInicio(new Date(2017,1,5));
		camp.setDataTermino(new Date(2017,12,10));
		camp.setValorTaxa(10);
		camp.setMinJog(5);
		camp.setMaxJog(15);
		camp.setMinTimeCat(10);
		campeonatos.add(camp);
		
		camp = new Campeonato();
		camp.setAno(2016);
		camp.setDataInicio(new Date(2016,1,5));
		camp.setDataTermino(new Date(2016,12,10));
		camp.setValorTaxa(10);
		camp.setMinJog(5);
		camp.setMaxJog(15);
		camp.setMinTimeCat(10);
		campeonatos.add(camp);
		
		Categoria cat = new Categoria();
		cat.setNome("Teste1");
		cat.setAnoMin(2000);
		cat.setCampeonato(campeonatos.get(0));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		
		cat = new Categoria();
		cat.setNome("Teste2");
		cat.setAnoMin(1990);
		cat.setCampeonato(campeonatos.get(0));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		
		cat = new Categoria();
		cat.setNome("Teste3");
		cat.setAnoMin(1995);
		cat.setCampeonato(campeonatos.get(0));
		cat.setSexo('F');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		
		cat = new Categoria();
		cat.setNome("Teste4");
		cat.setAnoMin(1999);
		cat.setCampeonato(campeonatos.get(1));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		
		cat = new Categoria();
		cat.setNome("Teste5");
		cat.setAnoMin(1980);
		cat.setCampeonato(campeonatos.get(1));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		
		Time time = new Time();
		time.setNome("Corinthians");
		time.setCidade("São Paulo");
		//time.setLogo(ImageIO.read(getClass().getResource("../../resources/sistema/1_0/imagens/corinthianslogo.png")));
		times.add(time);
		
		
		time = new Time();
		time.setNome("Palmeiras");
		time.setCidade("São Paulo");
		//time.setLogo(ImageIO.read(getClass().getResource("../../resources/sistema/1_0/imagens/palmeiraslogo.png")));
		times.add(time);
		
		time = new Time();
		time.setNome("Santos");
		time.setCidade("São Paulo");
		//time.setLogo(ImageIO.read(getClass().getResourceAsStream("../../resources/sistema/1_0/imagens/santoslogo.png")));
		times.add(time);
		
		time = new Time();
		time.setNome("São Paulo");
		time.setCidade("São Paulo");
		//time.setLogo(ImageIO.read(getClass().getResourceAsStream("../../resources/sistema/1_0/imagens/sãopaulologo.png")));
		times.add(time);
		
		Usuario user = new Usuario();
		user.setNome("Igor Cunha Gomes");
	    user.setSenha("123");
	    user.setRg("552576011");
	    user.setCpf("55257601184");
	    user.setCref("99999-a/aa");
	    user.setEmail("igor@cunha.com");
	    user.setDataNasc(new Date(1932,1,5));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Samuel Goncalves Cunha");
	    user.setSenha("123");
	    user.setRg("951061638");
	    user.setCpf("95106163897");
	    user.setCref("99999-a/aa");
	    user.setEmail("samuel@goncalves.com");
	    user.setDataNasc(new Date(1990,5,9));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Douglas Dias Rocha");
	    user.setSenha("123");
	    user.setRg("469353231");
	    user.setCpf("46935323126");
	    user.setCref("99999-a/aa");
	    user.setEmail("douglas@dias.com");
	    user.setDataNasc(new Date(1991,6,10));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Kai Ferreira Rocha");
	    user.setSenha("123");
	    user.setRg("499713112");
	    user.setCpf("49971311216");
	    user.setCref("99999-a/aa");
	    user.setEmail("kai@ferreira.com");
	    user.setDataNasc(new Date(2000,11,29));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Renan Silva Rocha");
	    user.setSenha("123");
	    user.setRg("392771304");
	    user.setCpf("39277130407");
	    user.setCref("99999-a/aa");
	    user.setEmail("renan@silva.com");
	    user.setDataNasc(new Date(1951,02,07));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Murilo Goncalves Silva");
	    user.setSenha("123");
	    user.setRg("400216495");
	    user.setCpf("40021649502");
	    user.setCref("99999-a/aa");
	    user.setEmail("murilo@goncalves.com");
	    user.setDataNasc(new Date(1980,11,27));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Luiz Barbosa Melo");
	    user.setSenha("123");
	    user.setRg("644121475");
	    user.setCpf("64412147509");
	    user.setCref("99999-a/aa");
	    user.setEmail("luiz@barbosa.com");
	    user.setDataNasc(new Date(1998,03,15));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Luan Barros Silva");
	    user.setSenha("123");
	    user.setRg("448671721");
	    user.setCpf("44867172103");
	    user.setCref("99999-a/aa");
	    user.setEmail("luan@barros.com");
	    user.setDataNasc(new Date(1960,10,8));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Victor Ribeiro Rocha");
	    user.setSenha("123");
	    user.setRg("123221517");
	    user.setCpf("12322151718");
	    user.setCref("99999-a/aa");
	    user.setEmail("victor@ribeiro.com");
	    user.setDataNasc(new Date(1980,03,20));
		usuarios.add(user);
		
		user = new Usuario();
		user.setNome("Kauan Costa Fernandes");
	    user.setSenha("123");
	    user.setRg("302353950");
	    user.setCpf("30235395021");
	    user.setCref("99999-a/aa");
	    user.setEmail("kauan@costa.com");
	    user.setDataNasc(new Date(1982,8,16));
		usuarios.add(user);
		
	}
	
}
