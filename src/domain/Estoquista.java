package domain;

public class Estoquista extends Funcionarios {

	public Estoquista(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1315.00;
	}
	
}