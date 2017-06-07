package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.modelos.Inscricao;
import sistema.service.InscricaoService;

public class InscricaoDataModel extends ListDataModel<Inscricao> implements SelectableDataModel<Inscricao> 
{
	private InscricaoService servico = new InscricaoService();
	
	public InscricaoDataModel()
	{
		
	}

	public InscricaoDataModel(List <Inscricao> list)
	{
	   super(list);	
	}

	
	@Override
	public Inscricao getRowData(String rowKey) {
		
		for(Inscricao i: servico.getInscricoes())
		   if(Integer.parseInt(rowKey) ==  i.getNumero())
			   return i;
		
		return null;
	}

	@Override
	public Object getRowKey(Inscricao inscricao) {
		return inscricao.getNumero();
	}

}


