package sistema.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Time;
import sistema.modelos.Usuario;

public class FakeService {

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	private ArrayList<Time> times = new ArrayList<Time>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<String> cidades = new ArrayList<String>();
	
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List <Usuario> getUsuarios()
	{	
		return usuarios;	
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public List <Campeonato> getCampeonatos()
	{	
		return campeonatos;	
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	public List <Time> getTimes()
	{
		return times;	
	}
	public ArrayList<String> getCidades() {
		return cidades;
	}
	public void setCidades(ArrayList<String> cidades) {
		this.cidades = cidades;
	}
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	@SuppressWarnings("deprecation")
	public FakeService(){
		
		Campeonato camp = new Campeonato();
		
		camp.setNome("Cruzeir�o 2017");
		camp.setAno(2017);
		camp.setDataInicio(new Date(117,0,5));
		camp.setDataTermino(new Date(117,11,10));
		camp.setValorTaxa(10);
		camp.setMinJog(5);
		camp.setMaxJog(15);
		camp.setMinTimeCat(10);
		campeonatos.add(camp);
		
		camp = new Campeonato();
		camp.setNome("Cruzeir�o 2016");
		camp.setAno(2016);
		camp.setDataInicio(new Date(116,0,5));
		camp.setDataTermino(new Date(116,11,10));
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
		categorias.add(cat);
		campeonatos.get(0).addCategoria(cat);
		
		cat = new Categoria();
		cat.setNome("Teste2");
		cat.setAnoMin(1990);
		cat.setCampeonato(campeonatos.get(0));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		categorias.add(cat);
		campeonatos.get(0).addCategoria(cat);
		
		cat = new Categoria();
		cat.setNome("Teste3");
		cat.setAnoMin(1995);
		cat.setCampeonato(campeonatos.get(0));
		cat.setSexo('F');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		categorias.add(cat);
		campeonatos.get(0).addCategoria(cat);
		
		cat = new Categoria();
		cat.setNome("Teste4");
		cat.setAnoMin(1999);
		cat.setCampeonato(campeonatos.get(1));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		categorias.add(cat);
		campeonatos.get(1).addCategoria(cat);
		
		cat = new Categoria();
		cat.setNome("Teste5");
		cat.setAnoMin(1980);
		cat.setCampeonato(campeonatos.get(1));
		cat.setSexo('M');
		cat.setHabCadJog(true);
		cat.setHabCadTime(true);
		categorias.add(cat);
		campeonatos.get(1).addCategoria(cat);
		
		Time time = new Time();
		time.setNome("Corinthians");
		time.setCidade("S�o Paulo");
		//time.setLogo(ImageIO.read(getClass().getResource("../../resources/sistema/1_0/imagens/corinthianslogo.png")));
		times.add(time);
		
		
		time = new Time();
		time.setNome("Palmeiras");
		time.setCidade("S�o Paulo");
		//time.setLogo(ImageIO.read(getClass().getResource("../../resources/sistema/1_0/imagens/palmeiraslogo.png")));
		times.add(time);
		
		time = new Time();
		time.setNome("Santos");
		time.setCidade("S�o Paulo");
		//time.setLogo(ImageIO.read(getClass().getResourceAsStream("../../resources/sistema/1_0/imagens/santoslogo.png")));
		times.add(time);
		
		time = new Time();
		time.setNome("S�o Paulo");
		time.setCidade("S�o Paulo");
		//time.setLogo(ImageIO.read(getClass().getResourceAsStream("../../resources/sistema/1_0/imagens/s�opaulologo.png")));
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
		
		cidades.add("Adamantina");
		cidades.add("Adolfo");
		cidades.add("Agua�");
		cidades.add("�guas da Prata");
		cidades.add("�guas de Lind�ia");
		cidades.add("�guas de Santa B�rbara");
		cidades.add("�guas de S�o Pedro");
		cidades.add("Agudos");
		cidades.add("Alambari");
		cidades.add("Alfredo Marcondes");
		cidades.add("Altair");
		cidades.add("Altin�polis");
		cidades.add("Alto Alegre");
		cidades.add("Alum�nio");
		cidades.add("�lvares Florence");
		cidades.add("�lvares Machado");
		cidades.add("�lvaro de Carvalho");
		cidades.add("Alvinl�ndia");
		cidades.add("Americana");
		cidades.add("Am�rico Brasiliense");
		cidades.add("Am�rico de Campos");
		cidades.add("Amparo");
		cidades.add("Anal�ndia");
		cidades.add("Andradina");
		cidades.add("Angatuba");
		cidades.add("Anhembi");
		cidades.add("Anhumas");
		cidades.add("Aparecida");
		cidades.add("Aparecida d`Oeste");
		cidades.add("Apia�");
		cidades.add("Ara�ariguama");
		cidades.add("Ara�atuba");
		cidades.add("Ara�oiaba da Serra");
		cidades.add("Aramina");
		cidades.add("Arandu");
		cidades.add("Arape�");
		cidades.add("Araraquara");
		cidades.add("Araras");
		cidades.add("Arco-�ris");
		cidades.add("Arealva");
		cidades.add("Areias");
		cidades.add("Arei�polis");
		cidades.add("Ariranha");
		cidades.add("Artur Nogueira");
		cidades.add("Aruj�");
		cidades.add("Asp�sia");
		cidades.add("Assis");
		cidades.add("Atibaia");
		cidades.add("Auriflama");
		cidades.add("Ava�");
		cidades.add("Avanhandava");
		cidades.add("Avar�");
		cidades.add("Bady Bassitt");
		cidades.add("Balbinos");
		cidades.add("B�lsamo");
		cidades.add("Bananal");
		cidades.add("Bar�o de Antonina");
		cidades.add("Barbosa");
		cidades.add("Bariri");
		cidades.add("Barra Bonita");
		cidades.add("Barra do Chap�u");
		cidades.add("Barra do Turvo");
		cidades.add("Barretos");
		cidades.add("Barrinha");
		cidades.add("Barueri");
		cidades.add("Bastos");
		cidades.add("Batatais");
		cidades.add("Bauru");
		cidades.add("Bebedouro");
		cidades.add("Bento de Abreu");
		cidades.add("Bernardino de Campos");
		cidades.add("Bertioga");
		cidades.add("Bilac");
		cidades.add("Birigui");
		cidades.add("Biritiba-Mirim");
		cidades.add("Boa Esperan�a do Sul");
		cidades.add("Bocaina");
		cidades.add("Bofete");
		cidades.add("Boituva");
		cidades.add("Bom Jesus dos Perd�es");
		cidades.add("Bom Sucesso de Itarar�");
		cidades.add("Bor�");
		cidades.add("Borac�ia");
		cidades.add("Borborema");
		cidades.add("Borebi");
		cidades.add("Botucatu");
		cidades.add("Bragan�a Paulista");
		cidades.add("Bra�na");
		cidades.add("Brejo Alegre");
		cidades.add("Brodowski");
		cidades.add("Brotas");
		cidades.add("Buri");
		cidades.add("Buritama");
		cidades.add("Buritizal");
		cidades.add("Cabr�lia Paulista");
		cidades.add("Cabre�va");
		cidades.add("Ca�apava");
		cidades.add("Cachoeira Paulista");
		cidades.add("Caconde");
		cidades.add("Cafel�ndia");
		cidades.add("Caiabu");
		cidades.add("Caieiras");
		cidades.add("Caiu�");
		cidades.add("Cajamar");
		cidades.add("Cajati");
		cidades.add("Cajobi");
		cidades.add("Cajuru");
		cidades.add("Campina do Monte Alegre");
		cidades.add("Campinas");
		cidades.add("Campo Limpo Paulista");
		cidades.add("Campos do Jord�o");
		cidades.add("Campos Novos Paulista");
		cidades.add("Canan�ia");
		cidades.add("Canas");
		cidades.add("C�ndido Mota");
		cidades.add("C�ndido Rodrigues");
		cidades.add("Canitar");
		cidades.add("Cap�o Bonito");
		cidades.add("Capela do Alto");
		cidades.add("Capivari");
		cidades.add("Caraguatatuba");
		cidades.add("Carapicu�ba");
		cidades.add("Cardoso");
		cidades.add("Casa Branca");
		cidades.add("C�ssia dos Coqueiros");
		cidades.add("Castilho");
		cidades.add("Catanduva");
		cidades.add("Catigu�");
		cidades.add("Cedral");
		cidades.add("Cerqueira C�sar");
		cidades.add("Cerquilho");
		cidades.add("Ces�rio Lange");
		cidades.add("Charqueada");
		cidades.add("Chavantes");
		cidades.add("Clementina");
		cidades.add("Colina");
		cidades.add("Col�mbia");
		cidades.add("Conchal");
		cidades.add("Conchas");
		cidades.add("Cordeir�polis");
		cidades.add("Coroados");
		cidades.add("Coronel Macedo");
		cidades.add("Corumbata�");
		cidades.add("Cosm�polis");
		cidades.add("Cosmorama");
		cidades.add("Cotia");
		cidades.add("Cravinhos");
		cidades.add("Cristais Paulista");
		cidades.add("Cruz�lia");
		cidades.add("Cruzeiro");
		cidades.add("Cubat�o");
		cidades.add("Cunha");
		cidades.add("Descalvado");
		cidades.add("Diadema");
		cidades.add("Dirce Reis");
		cidades.add("Divinol�ndia");
		cidades.add("Dobrada");
		cidades.add("Dois C�rregos");
		cidades.add("Dolcin�polis");
		cidades.add("Dourado");
		cidades.add("Dracena");
		cidades.add("Duartina");
		cidades.add("Dumont");
		cidades.add("Echapor�");
		cidades.add("Eldorado");
		cidades.add("Elias Fausto");
		cidades.add("Elisi�rio");
		cidades.add("Emba�ba");
		cidades.add("Embu das Artes");
		cidades.add("Embu-Gua�u");
		cidades.add("Emilian�polis");
		cidades.add("Engenheiro Coelho");
		cidades.add("Esp�rito Santo do Pinhal");
		cidades.add("Esp�rito Santo do Turvo");
		cidades.add("Estiva Gerbi");
		cidades.add("Estrela do Norte");
		cidades.add("Estrela d`Oeste");
		cidades.add("Euclides da Cunha Paulista");
		cidades.add("Fartura");
		cidades.add("Fernando Prestes");
		cidades.add("Fernand�polis");
		cidades.add("Fern�o");
		cidades.add("Ferraz de Vasconcelos");
		cidades.add("Flora Rica");
		cidades.add("Floreal");
		cidades.add("Fl�rida Paulista");
		cidades.add("Flor�nia");
		cidades.add("Franca");
		cidades.add("Francisco Morato");
		cidades.add("Franco da Rocha");
		cidades.add("Gabriel Monteiro");
		cidades.add("G�lia");
		cidades.add("Gar�a");
		cidades.add("Gast�o Vidigal");
		cidades.add("Gavi�o Peixoto");
		cidades.add("General Salgado");
		cidades.add("Getulina");
		cidades.add("Glic�rio");
		cidades.add("Guai�ara");
		cidades.add("Guaimb�");
		cidades.add("Gua�ra");
		cidades.add("Guapia�u");
		cidades.add("Guapiara");
		cidades.add("Guar�");
		cidades.add("Guara�a�");
		cidades.add("Guaraci");
		cidades.add("Guarani d`Oeste");
		cidades.add("Guarant�");
		cidades.add("Guararapes");
		cidades.add("Guararema");
		cidades.add("Guaratinguet�");
		cidades.add("Guare�");
		cidades.add("Guariba");
		cidades.add("Guaruj�");
		cidades.add("Guarulhos");
		cidades.add("Guatapar�");
		cidades.add("Guzol�ndia");
		cidades.add("Hercul�ndia");
		cidades.add("Holambra");
		cidades.add("Hortol�ndia");
		cidades.add("Iacanga");
		cidades.add("Iacri");
		cidades.add("Iaras");
		cidades.add("Ibat�");
		cidades.add("Ibir�");
		cidades.add("Ibirarema");
		cidades.add("Ibitinga");
		cidades.add("Ibi�na");
		cidades.add("Ic�m");
		cidades.add("Iep�");
		cidades.add("Igara�u do Tiet�");
		cidades.add("Igarapava");
		cidades.add("Igarat�");
		cidades.add("Iguape");
		cidades.add("Ilha Comprida");
		cidades.add("Ilha Solteira");
		cidades.add("Ilhabela");
		cidades.add("Indaiatuba");
		cidades.add("Indiana");
		cidades.add("Indiapor�");
		cidades.add("In�bia Paulista");
		cidades.add("Ipaussu");
		cidades.add("Iper�");
		cidades.add("Ipe�na");
		cidades.add("Ipigu�");
		cidades.add("Iporanga");
		cidades.add("Ipu�");
		cidades.add("Iracem�polis");
		cidades.add("Irapu�");
		cidades.add("Irapuru");
		cidades.add("Itaber�");
		cidades.add("Ita�");
		cidades.add("Itajobi");
		cidades.add("Itaju");
		cidades.add("Itanha�m");
		cidades.add("Ita�ca");
		cidades.add("Itapecerica da Serra");
		cidades.add("Itapetininga");
		cidades.add("Itapeva");
		cidades.add("Itapevi");
		cidades.add("Itapira");
		cidades.add("Itapirapu� Paulista");
		cidades.add("It�polis");
		cidades.add("Itaporanga");
		cidades.add("Itapu�");
		cidades.add("Itapura");
		cidades.add("Itaquaquecetuba");
		cidades.add("Itarar�");
		cidades.add("Itariri");
		cidades.add("Itatiba");
		cidades.add("Itatinga");
		cidades.add("Itirapina");
		cidades.add("Itirapu�");
		cidades.add("Itobi");
		cidades.add("Itu");
		cidades.add("Itupeva");
		cidades.add("Ituverava");
		cidades.add("Jaborandi");
		cidades.add("Jaboticabal");
		cidades.add("Jacare�");
		cidades.add("Jaci");
		cidades.add("Jacupiranga");
		cidades.add("Jaguari�na");
		cidades.add("Jales");
		cidades.add("Jambeiro");
		cidades.add("Jandira");
		cidades.add("Jardin�polis");
		cidades.add("Jarinu");
		cidades.add("Ja�");
		cidades.add("Jeriquara");
		cidades.add("Joan�polis");
		cidades.add("Jo�o Ramalho");
		cidades.add("Jos� Bonif�cio");
		cidades.add("J�lio Mesquita");
		cidades.add("Jumirim");
		cidades.add("Jundia�");
		cidades.add("Junqueir�polis");
		cidades.add("Juqui�");
		cidades.add("Juquitiba");
		cidades.add("Lagoinha");
		cidades.add("Laranjal Paulista");
		cidades.add("Lav�nia");
		cidades.add("Lavrinhas");
		cidades.add("Leme");
		cidades.add("Len��is Paulista");
		cidades.add("Limeira");
		cidades.add("Lind�ia");
		cidades.add("Lins");
		cidades.add("Lorena");
		cidades.add("Lourdes");
		cidades.add("Louveira");
		cidades.add("Luc�lia");
		cidades.add("Lucian�polis");
		cidades.add("Lu�s Ant�nio");
		cidades.add("Luizi�nia");
		cidades.add("Lup�rcio");
		cidades.add("Lut�cia");
		cidades.add("Macatuba");
		cidades.add("Macaubal");
		cidades.add("Maced�nia");
		cidades.add("Magda");
		cidades.add("Mairinque");
		cidades.add("Mairipor�");
		cidades.add("Manduri");
		cidades.add("Marab� Paulista");
		cidades.add("Maraca�");
		cidades.add("Marapoama");
		cidades.add("Mari�polis");
		cidades.add("Mar�lia");
		cidades.add("Marin�polis");
		cidades.add("Martin�polis");
		cidades.add("Mat�o");
		cidades.add("Mau�");
		cidades.add("Mendon�a");
		cidades.add("Meridiano");
		cidades.add("Mes�polis");
		cidades.add("Miguel�polis");
		cidades.add("Mineiros do Tiet�");
		cidades.add("Mira Estrela");
		cidades.add("Miracatu");
		cidades.add("Mirand�polis");
		cidades.add("Mirante do Paranapanema");
		cidades.add("Mirassol");
		cidades.add("Mirassol�ndia");
		cidades.add("Mococa");
		cidades.add("Mogi das Cruzes");
		cidades.add("Mogi Gua�u");
		cidades.add("Mogi Mirim");
		cidades.add("Mombuca");
		cidades.add("Mon��es");
		cidades.add("Mongagu�");
		cidades.add("Monte Alegre do Sul");
		cidades.add("Monte Alto");
		cidades.add("Monte Apraz�vel");
		cidades.add("Monte Azul Paulista");
		cidades.add("Monte Castelo");
		cidades.add("Monte Mor");
		cidades.add("Monteiro Lobato");
		cidades.add("Morro Agudo");
		cidades.add("Morungaba");
		cidades.add("Motuca");
		cidades.add("Murutinga do Sul");
		cidades.add("Nantes");
		cidades.add("Narandiba");
		cidades.add("Natividade da Serra");
		cidades.add("Nazar� Paulista");
		cidades.add("Neves Paulista");
		cidades.add("Nhandeara");
		cidades.add("Nipo�");
		cidades.add("Nova Alian�a");
		cidades.add("Nova Campina");
		cidades.add("Nova Cana� Paulista");
		cidades.add("Nova Castilho");
		cidades.add("Nova Europa");
		cidades.add("Nova Granada");
		cidades.add("Nova Guataporanga");
		cidades.add("Nova Independ�ncia");
		cidades.add("Nova Luzit�nia");
		cidades.add("Nova Odessa");
		cidades.add("Novais");
		cidades.add("Novo Horizonte");
		cidades.add("Nuporanga");
		cidades.add("Ocau�u");
		cidades.add("�leo");
		cidades.add("Ol�mpia");
		cidades.add("Onda Verde");
		cidades.add("Oriente");
		cidades.add("Orindi�va");
		cidades.add("Orl�ndia");
		cidades.add("Osasco");
		cidades.add("Oscar Bressane");
		cidades.add("Osvaldo Cruz");
		cidades.add("Ourinhos");
		cidades.add("Ouro Verde");
		cidades.add("Ouroeste");
		cidades.add("Pacaembu");
		cidades.add("Palestina");
		cidades.add("Palmares Paulista");
		cidades.add("Palmeira d`Oeste");
		cidades.add("Palmital");
		cidades.add("Panorama");
		cidades.add("Paragua�u Paulista");
		cidades.add("Paraibuna");
		cidades.add("Para�so");
		cidades.add("Paranapanema");
		cidades.add("Paranapu�");
		cidades.add("Parapu�");
		cidades.add("Pardinho");
		cidades.add("Pariquera-A�u");
		cidades.add("Parisi");
		cidades.add("Patroc�nio Paulista");
		cidades.add("Paulic�ia");
		cidades.add("Paul�nia");
		cidades.add("Paulist�nia");
		cidades.add("Paulo de Faria");
		cidades.add("Pederneiras");
		cidades.add("Pedra Bela");
		cidades.add("Pedran�polis");
		cidades.add("Pedregulho");
		cidades.add("Pedreira");
		cidades.add("Pedrinhas Paulista");
		cidades.add("Pedro de Toledo");
		cidades.add("Pen�polis");
		cidades.add("Pereira Barreto");
		cidades.add("Pereiras");
		cidades.add("Peru�be");
		cidades.add("Piacatu");
		cidades.add("Piedade");
		cidades.add("Pilar do Sul");
		cidades.add("Pindamonhangaba");
		cidades.add("Pindorama");
		cidades.add("Pinhalzinho");
		cidades.add("Piquerobi");
		cidades.add("Piquete");
		cidades.add("Piracaia");
		cidades.add("Piracicaba");
		cidades.add("Piraju");
		cidades.add("Piraju�");
		cidades.add("Pirangi");
		cidades.add("Pirapora do Bom Jesus");
		cidades.add("Pirapozinho");
		cidades.add("Pirassununga");
		cidades.add("Piratininga");
		cidades.add("Pitangueiras");
		cidades.add("Planalto");
		cidades.add("Platina");
		cidades.add("Po�");
		cidades.add("Poloni");
		cidades.add("Pomp�ia");
		cidades.add("Ponga�");
		cidades.add("Pontal");
		cidades.add("Pontalinda");
		cidades.add("Pontes Gestal");
		cidades.add("Populina");
		cidades.add("Porangaba");
		cidades.add("Porto Feliz");
		cidades.add("Porto Ferreira");
		cidades.add("Potim");
		cidades.add("Potirendaba");
		cidades.add("Pracinha");
		cidades.add("Prad�polis");
		cidades.add("Praia Grande");
		cidades.add("Prat�nia");
		cidades.add("Presidente Alves");
		cidades.add("Presidente Bernardes");
		cidades.add("Presidente Epit�cio");
		cidades.add("Presidente Prudente");
		cidades.add("Presidente Venceslau");
		cidades.add("Promiss�o");
		cidades.add("Quadra");
		cidades.add("Quat�");
		cidades.add("Queiroz");
		cidades.add("Queluz");
		cidades.add("Quintana");
		cidades.add("Rafard");
		cidades.add("Rancharia");
		cidades.add("Reden��o da Serra");
		cidades.add("Regente Feij�");
		cidades.add("Regin�polis");
		cidades.add("Registro");
		cidades.add("Restinga");
		cidades.add("Ribeira");
		cidades.add("Ribeir�o Bonito");
		cidades.add("Ribeir�o Branco");
		cidades.add("Ribeir�o Corrente");
		cidades.add("Ribeir�o do Sul");
		cidades.add("Ribeir�o dos �ndios");
		cidades.add("Ribeir�o Grande");
		cidades.add("Ribeir�o Pires");
		cidades.add("Ribeir�o Preto");
		cidades.add("Rifaina");
		cidades.add("Rinc�o");
		cidades.add("Rin�polis");
		cidades.add("Rio Claro");
		cidades.add("Rio das Pedras");
		cidades.add("Rio Grande da Serra");
		cidades.add("Riol�ndia");
		cidades.add("Riversul");
		cidades.add("Rosana");
		cidades.add("Roseira");
		cidades.add("Rubi�cea");
		cidades.add("Rubin�ia");
		cidades.add("Sabino");
		cidades.add("Sagres");
		cidades.add("Sales");
		cidades.add("Sales Oliveira");
		cidades.add("Sales�polis");
		cidades.add("Salmour�o");
		cidades.add("Saltinho");
		cidades.add("Salto");
		cidades.add("Salto de Pirapora");
		cidades.add("Salto Grande");
		cidades.add("Sandovalina");
		cidades.add("Santa Ad�lia");
		cidades.add("Santa Albertina");
		cidades.add("Santa B�rbara d`Oeste");
		cidades.add("Santa Branca");
		cidades.add("Santa Clara d`Oeste");
		cidades.add("Santa Cruz da Concei��o");
		cidades.add("Santa Cruz da Esperan�a");
		cidades.add("Santa Cruz das Palmeiras");
		cidades.add("Santa Cruz do Rio Pardo");
		cidades.add("Santa Ernestina");
		cidades.add("Santa F� do Sul");
		cidades.add("Santa Gertrudes");
		cidades.add("Santa Isabel");
		cidades.add("Santa L�cia");
		cidades.add("Santa Maria da Serra");
		cidades.add("Santa Mercedes");
		cidades.add("Santa Rita do Passa Quatro");
		cidades.add("Santa Rita d`Oeste");
		cidades.add("Santa Rosa de Viterbo");
		cidades.add("Santa Salete");
		cidades.add("Santana da Ponte Pensa");
		cidades.add("Santana de Parna�ba");
		cidades.add("Santo Anast�cio");
		cidades.add("Santo Andr�");
		cidades.add("Santo Ant�nio da Alegria");
		cidades.add("Santo Ant�nio de Posse");
		cidades.add("Santo Ant�nio do Aracangu�");
		cidades.add("Santo Ant�nio do Jardim");
		cidades.add("Santo Ant�nio do Pinhal");
		cidades.add("Santo Expedito");
		cidades.add("Sant�polis do Aguape�");
		cidades.add("Santos");
		cidades.add("S�o Bento do Sapuca�");
		cidades.add("S�o Bernardo do Campo");
		cidades.add("S�o Caetano do Sul");
		cidades.add("S�o Carlos");
		cidades.add("S�o Francisco");
		cidades.add("S�o Jo�o da Boa Vista");
		cidades.add("S�o Jo�o das Duas Pontes");
		cidades.add("S�o Jo�o de Iracema");
		cidades.add("S�o Jo�o do Pau d`Alho");
		cidades.add("S�o Joaquim da Barra");
		cidades.add("S�o Jos� da Bela Vista");
		cidades.add("S�o Jos� do Barreiro");
		cidades.add("S�o Jos� do Rio Pardo");
		cidades.add("S�o Jos� do Rio Preto");
		cidades.add("S�o Jos� dos Campos");
		cidades.add("S�o Louren�o da Serra");
		cidades.add("S�o Lu�s do Paraitinga");
		cidades.add("S�o Manuel");
		cidades.add("S�o Miguel Arcanjo");
		cidades.add("S�o Paulo");
		cidades.add("S�o Pedro");
		cidades.add("S�o Pedro do Turvo");
		cidades.add("S�o Roque");
		cidades.add("S�o Sebasti�o");
		cidades.add("S�o Sebasti�o da Grama");
		cidades.add("S�o Sim�o");
		cidades.add("S�o Vicente");
		cidades.add("Sarapu�");
		cidades.add("Sarutai�");
		cidades.add("Sebastian�polis do Sul");
		cidades.add("Serra Azul");
		cidades.add("Serra Negra");
		cidades.add("Serrana");
		cidades.add("Sert�ozinho");
		cidades.add("Sete Barras");
		cidades.add("Sever�nia");
		cidades.add("Silveiras");
		cidades.add("Socorro");
		cidades.add("Sorocaba");
		cidades.add("Sud Mennucci");
		cidades.add("Sumar�");
		cidades.add("Suzan�polis");
		cidades.add("Suzano");
		cidades.add("Tabapu�");
		cidades.add("Tabatinga");
		cidades.add("Tabo�o da Serra");
		cidades.add("Taciba");
		cidades.add("Tagua�");
		cidades.add("Taia�u");
		cidades.add("Tai�va");
		cidades.add("Tamba�");
		cidades.add("Tanabi");
		cidades.add("Tapira�");
		cidades.add("Tapiratiba");
		cidades.add("Taquaral");
		cidades.add("Taquaritinga");
		cidades.add("Taquarituba");
		cidades.add("Taquariva�");
		cidades.add("Tarabai");
		cidades.add("Tarum�");
		cidades.add("Tatu�");
		cidades.add("Taubat�");
		cidades.add("Tejup�");
		cidades.add("Teodoro Sampaio");
		cidades.add("Terra Roxa");
		cidades.add("Tiet�");
		cidades.add("Timburi");
		cidades.add("Torre de Pedra");
		cidades.add("Torrinha");
		cidades.add("Trabiju");
		cidades.add("Trememb�");
		cidades.add("Tr�s Fronteiras");
		cidades.add("Tuiuti");
		cidades.add("Tup�");
		cidades.add("Tupi Paulista");
		cidades.add("Turi�ba");
		cidades.add("Turmalina");
		cidades.add("Ubarana");
		cidades.add("Ubatuba");
		cidades.add("Ubirajara");
		cidades.add("Uchoa");
		cidades.add("Uni�o Paulista");
		cidades.add("Ur�nia");
		cidades.add("Uru");
		cidades.add("Urup�s");
		cidades.add("Valentim Gentil");
		cidades.add("Valinhos");
		cidades.add("Valpara�so");
		cidades.add("Vargem");
		cidades.add("Vargem Grande do Sul");
		cidades.add("Vargem Grande Paulista");
		cidades.add("V�rzea Paulista");
		cidades.add("Vera Cruz");
		cidades.add("Vinhedo");
		cidades.add("Viradouro");
		cidades.add("Vista Alegre do Alto");
		cidades.add("Vit�ria Brasil");
		cidades.add("Votorantim");
		cidades.add("Votuporanga");
		cidades.add("Zacarias");
	}
	
}
