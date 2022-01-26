package domain;

public class Empacotador extends Funcionarios {
	
	public Empacotador(){
		System.out.println("Seja bem vindo, o seu salário bruto será de 1100.00$");
	}
	
	public double getSalario() {
		return super.getSalario() + 1100.00;
	}
	
}
