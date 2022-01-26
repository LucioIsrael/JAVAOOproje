package domain;

public class Padeiro extends Funcionarios {


	public Padeiro(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1271.00;
	}
	
}
