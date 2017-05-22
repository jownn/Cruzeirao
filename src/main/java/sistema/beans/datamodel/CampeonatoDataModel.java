package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

public class CampeonatoDataModel extends ListDataModel<Campeonato> implements SelectableDataModel<Campeonato> 
{
	private CampeonatoService servico = new CampeonatoService();
	
	public CampeonatoDataModel()
	{
		
	}

	public CampeonatoDataModel(List <Campeonato> list)
	{
	   super(list);	
	}

	
	@Override
	public Campeonato getRowData(String rowKey) {
		
		for(Campeonato c: servico.getCampeonatos())
		   if(Integer.parseInt(rowKey) ==  c.getCodigoCampeonato())
			   return c;
		
		return null;
	}

	@Override
	public Object getRowKey(Campeonato campeonato) {
		return campeonato.getCodigoCampeonato();
	}

}
