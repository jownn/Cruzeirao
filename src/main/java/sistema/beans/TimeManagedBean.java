package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Time;
import sistema.service.FakeService;


@ManagedBean
public class TimeManagedBean {
	
	private Time time = new Time();
	private FakeService service = new FakeService();
    
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

