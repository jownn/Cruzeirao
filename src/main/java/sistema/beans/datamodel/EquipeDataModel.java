package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.modelos.Campeonato;
import sistema.modelos.Equipe;
import sistema.service.EquipeService;

public class EquipeDataModel extends ListDataModel<Equipe> implements SelectableDataModel<Equipe> {
	private EquipeService servico = new EquipeService();
	
	public EquipeDataModel() 
	{
		
	}

	public EquipeDataModel(List <Equipe> list)
	{
		super(list);
	}

	
	public Equipe getRowData(String rowKey) {
		
		for(Equipe c: servico.getEquipes())
		   if(Integer.parseInt(rowKey) ==  c.getCodigoEquipe())
			   return c;
		
		return null;
	}

	public Object getRowKey(Equipe equipe) {
		return equipe.getCodigoEquipe();
	}

}
