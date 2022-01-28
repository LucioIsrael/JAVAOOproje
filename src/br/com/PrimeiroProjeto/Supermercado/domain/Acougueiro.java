package br.com.PrimeiroProjeto.Supermercado.domain;

public class Acougueiro extends Funcionarios {
		
	public Acougueiro(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1507.00$");
	}
	

	public double getSalario() {
		return super.getSalario() + 1507.00;
	}
	
  }	

