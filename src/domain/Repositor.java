package domain;

public class Repositor extends Funcionarios {

	public Repositor(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1189.00;
	}
	
}
