package sistema.modelos;

import java.util.Date;

public class Partida {

	private Time time1;
	private Time time2;
	private int placar;
	private Local local;
	private Date data;
	
	public Time getTime1() {
		return time1;
	}
	public void setTime1(Time time1) {
		this.time1 = time1;
	}
	public Time getTime2() {
		return time2;
	}
	public void setTime2(Time time2) {
		this.time2 = time2;
	}
	public int getPlacar() {
		return placar;
	}
	public void setPlacar(int placar) {
		this.placar = placar;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
