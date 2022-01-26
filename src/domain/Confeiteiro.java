package domain;

public class Confeiteiro extends Funcionarios {

	public Confeiteiro(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1271.00;
	}
}
