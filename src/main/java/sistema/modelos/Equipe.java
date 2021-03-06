package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.primefaces.event.RowEditEvent;

@Entity
public class Equipe implements Serializable{

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoEquipe;

	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataFundacao;

	private String cidade;

	@ManyToMany
	private List<Usuario> diretores = new ArrayList<Usuario>();

	//GETTERS AND SETTERS
	public String getNome() {

		return nome;

	}
	

	public boolean isDiretor(Usuario userAtual)
	{
		for(Usuario user : diretores)
		{
			if(user.getEmail().equals(userAtual.getEmail()))
				return true;
		}
		
		return false;
	}
	
	public String getDiretoresString(){
		String retorno="";
		
		for (Usuario user : diretores) {
			retorno += user.getEmail() + ", ";
		}
	
		return retorno;
	}
	
	public void setNome(String nome) {

		this.nome = nome;

	}

	public Date getDataFundacao() {
		return dataFundacao;

	}
	
	
	public String getDataFormat(){
		String x="";
		x += dataFundacao.getDay() + "/";
		x += dataFundacao.getMonth() + "/";
		x += (dataFundacao.getYear() + 1900);
		
		
		return x;
	}

	public void setDataFundacao(Date dataFundacao) {

		this.dataFundacao = dataFundacao;

	}

	public String getCidade() {

		return cidade;

	}

	public void setCidade(String cidade) {

		this.cidade = cidade;

	}

	public List<Usuario> getDiretores() {

		return diretores;

	}

	public void setDiretores(ArrayList<Usuario> diretores) {

		this.diretores = diretores;

	}
	

	public void addDiretor(Usuario diretor) {
		diretores.add(diretor);
	}

	public int getCodigoEquipe() {

		return codigoEquipe;

	}

	public void setCodigoEquipe(int codigoEquipe) {

		this.codigoEquipe = codigoEquipe;

	}

	
	public void onRowEdit(RowEditEvent event) {

	
		//Equipe p = ((Equipe) event.getObject());
		//catService.alterar(p);
	}
	
	

}