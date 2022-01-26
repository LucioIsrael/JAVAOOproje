package domain;

public class Empacotador extends Funcionarios {

	public Empacotador(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1100.00;
	}
	
}
