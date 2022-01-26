package domain;

public class Seguranca extends Funcionarios {

	public Seguranca(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1539.00;
	}
	
}
