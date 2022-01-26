package domain;

public class AuxiliarAdministrativo extends Funcionarios {
	
	public AuxiliarAdministrativo(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1507.00;
	}
}
