package sistema.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

@FacesConverter("converterCampeonato")
public class CampeonatoConverter implements Converter {

	private CampeonatoService servico = new CampeonatoService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

		
		if (value != null && !value.isEmpty()) {
			
			  for(Campeonato c : servico.getCampeonatos())
				 if(c.getNome().equals(value))
				  	return c;
					
		}

		return null;

	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object campeonato) {
		if (campeonato == null || campeonato.equals("")) {
			return null;
		} else {
			return ((Campeonato) campeonato).getNome();

		}
	}

}
