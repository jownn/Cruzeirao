package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {
	
	private int ano;
	private List<Categoria> categoria = new ArrayList<Categoria>();
	private Date dataInicio;
	private Date dataTermino;
	private double valorTaxa;
	private int minJog;
	private int maxJog;
	private int minTimeCat;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Categoria> getCategoria() {
		return categoria;
	}
	public void addCategoria(Categoria categoria) {
		this.categoria.add(categoria);
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	public int getMinJog() {
		return minJog;
	}
	public void setMinJog(int minJog) {
		this.minJog = minJog;
	}
	public int getMaxJog() {
		return maxJog;
	}
	public void setMaxJog(int maxJog) {
		this.maxJog = maxJog;
	}
	public int getMinTimeCat() {
		return minTimeCat;
	}
	public void setMinTimeCat(int minTimeCat) {
		this.minTimeCat = minTimeCat;
	}
	
}
