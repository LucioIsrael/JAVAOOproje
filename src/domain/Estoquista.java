package domain;

public class Estoquista extends Funcionarios {

	public Estoquista(){
		System.out.println("Seja bem vindo, o seu sal�rio bruto ser� de 1315.00");
	}
	
	public double getSalario() {
		return super.getSalario() + 1315.00;
	}
	
}