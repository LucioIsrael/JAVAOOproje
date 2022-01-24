

public abstract class Funcionarios {

	private String nome;
	private String cpf;
	private double salario = 0.0;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}

	
	public double getSalario() {
		return salario;
	}
	
}
