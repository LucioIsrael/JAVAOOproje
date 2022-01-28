package br.com.PrimeiroProjeto.Supermercado.domain;

import br.com.PrimeiroProjeto.Supermercado.interfaces.*;

public class OperadorDeCaixa extends Funcionarios implements Alarme{
	
	public OperadorDeCaixa(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1228.00");
	}
	
	public double getSalario() {
		return super.getSalario() + 1228.00;
	}

	@Override
	public void chamarpolicia() {
		System.out.println("A policia foi chamada, aguarde instantes");
	}
	
}
