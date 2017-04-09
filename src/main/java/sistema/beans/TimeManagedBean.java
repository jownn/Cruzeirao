package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Time;
import sistema.service.TimeService;


@ManagedBean
public class TimeManagedBean {
	
	private Time time = new Time();
	private TimeService service = new TimeService();
    
    public String salvar() {
    	service.salvar(time);
		time = new Time();
        return "cadastroTime.xhtml";
    }
	
    public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List<Time> getTimes() {
		return service.getTimes();
	}
	
}

