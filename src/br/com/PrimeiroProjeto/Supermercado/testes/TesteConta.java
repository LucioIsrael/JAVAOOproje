package br.com.PrimeiroProjeto.Supermercado.testes;

import java.util.Set;

import br.com.PrimeiroProjeto.Supermercado.domain.Acougueiro;
import br.com.PrimeiroProjeto.Supermercado.domain.Gerente;

public class TesteConta {
	
	public static void main(String[] args) {
		try {
		

			
		  Acougueiro ac = new Acougueiro();
		  ac.setNome("Joselindo Alcantra");
		  ac.setCpf("084.283.842-52");
		  System.out.println(ac);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		}catch(RuntimeException ex) {
		  System.out.println(ex.getMessage());
		}
		
		


	}	
}
