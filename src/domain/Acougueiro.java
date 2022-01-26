package domain;

public class Acougueiro extends Funcionarios {
		
	public Acougueiro(String nome, String cpf) {
		super(nome, cpf);
	}

	public double getSalario() {
		return super.getSalario() + 1507.00;
	}
	
  }	

