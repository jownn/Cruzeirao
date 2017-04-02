package sistema.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TeamManagedBean {

	private String tecnico;
	private String massagista;
	private String auxiliar;
	private String preparadorFisico;
	private String nome;
	private String Categoria;
	private String cidade;
	private String inscricao;
	
	
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public String getMassagista() {
		return massagista;
	}
	public void setMassagista(String massagista) {
		this.massagista = massagista;
	}
	public String getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}
	public String getPreparadorFisico() {
		return preparadorFisico;
	}
	public void setPreparadorFisico(String preparadorFisico) {
		this.preparadorFisico = preparadorFisico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	
	 public String salvar() {
	        return "cadastroTime.xhtml";
	    }
	 
}

