package domain;

import interfaces.Alarme;

public class Seguranca extends Funcionarios implements Alarme {

	public Seguranca(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1539.00");
	}
	
	public double getSalario() {
		return super.getSalario() + 1539.00;
	}

	@Override
	public void chamarpolicia() {
		System.out.println("A policia foi acionada, aguarde instantes");
	}
	
}
