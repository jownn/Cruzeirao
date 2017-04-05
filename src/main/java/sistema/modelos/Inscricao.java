package sistema.modelos;

import java.awt.Image;

public class Inscricao {
	
	private Categoria categoria;
	private boolean status;
	private Image pagamento;
	private Time time;
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Image getPagamento() {
		return pagamento;
	}
	public void setPagamento(Image pagamento) {
		this.pagamento = pagamento;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
