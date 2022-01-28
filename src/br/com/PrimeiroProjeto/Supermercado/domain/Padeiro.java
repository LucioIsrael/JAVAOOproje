package br.com.PrimeiroProjeto.Supermercado.domain;

public class Padeiro extends Funcionarios {

	public Padeiro(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1271.00");
	}
	
	public double getSalario() {
		return super.getSalario() + 1271.00;
	}
	
}
