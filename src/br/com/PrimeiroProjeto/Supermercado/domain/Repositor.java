package br.com.PrimeiroProjeto.Supermercado.domain;

public class Repositor extends Funcionarios {

	public Repositor(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1189.00");
	}
	
	public double getSalario() {
		return super.getSalario() + 1189.00;
	}
	
}
