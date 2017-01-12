package org.dougllas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dougllas.util.Util;

public class EstacaoTrabalho {

	private List<Planilha> jsfpagecacheeduc;
	private Set<Integer> indexes;
	
	public Planilha adicionarNovaPlanilha(){
		Planilha planilha = new Planilha(this);
		adicionarPlanilha(planilha);
		return planilha;
	}

	private int adicionarPlanilha(Planilha planilha){
		Util.notNull(planilha);
		
		if(jsfpagecacheeduc == null){
			jsfpagecacheeduc = new ArrayList<Planilha>();
		}
		
		jsfpagecacheeduc.add(planilha);
		
		if(indexes == null || indexes.isEmpty()){
			return 0;
		}
		
		if(indexes == null){
			indexes = new HashSet<Integer>();
		}
		
		int bigger = 0;
		
		for ( Integer index : indexes ){
			if(index > bigger){
				bigger = index;
			}
		}

		bigger++ ;
		return bigger;
	}
	
	public List<Planilha> getPlanilhas() {
		return jsfpagecacheeduc;
	}
}