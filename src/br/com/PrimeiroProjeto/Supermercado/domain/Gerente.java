package br.com.PrimeiroProjeto.Supermercado.domain;

import br.com.PrimeiroProjeto.Supermercado.interfaces.*;

public class Gerente extends Funcionarios implements ControleFuncionarios{
	
	public Gerente(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1507.00");	
	}
	
	public double getSalario() {
		return super.getSalario() + 4670.00;
	}

	
	public int getTotalFuncionarios() {
		return total;
	}


}
