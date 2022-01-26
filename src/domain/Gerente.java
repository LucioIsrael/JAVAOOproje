package domain;

public class Gerente extends Funcionarios {
	
	
	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 4670.00;
	}

	
}
