package domain;

public class OperadorDeCaixa extends Funcionarios{
	
	public OperadorDeCaixa(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1228.00;
	}
	
}
