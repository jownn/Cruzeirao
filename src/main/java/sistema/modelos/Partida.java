package sistema.modelos;

import java.util.Date;

public class Partida {

	private Time time1;
	private Time time2;
	private int placarTime1;
	private int placarTime2;
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
	public int getPlacarTime1() {
		return placarTime1;
	}
	public void setPlacarTime1(int placarTime1) {
		this.placarTime1 = placarTime1;
	}
	public int getPlacarTime2() {
		return placarTime2;
	}
	public void setPlacarTime2(int placarTime2) {
		this.placarTime2 = placarTime2;
	}
	
}
