package sistema.modelos;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


public class Time {
	
	private String nome;
	private String cidade;
	private List<Inscricao> inscricao = new ArrayList<Inscricao>();
	private BufferedImage logo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Inscricao> getInscricao() {
		return inscricao;
	}
	public void addInscricao(Inscricao inscricao) {
		this.inscricao.add(inscricao);
	}
	public BufferedImage getLogo() {
		return logo;
	}
	public void setLogo(BufferedImage logo) {
		this.logo = logo;
	}

}
