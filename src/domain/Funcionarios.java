package domain;
import utils.CalculaDescontos;

public abstract class Funcionarios {

	private String nome;
	private String cpf;
	private double salario = 0.0;
	protected static int total = 0;
	
	public CalculaDescontos desc;
	
	
	public Funcionarios() {
		this.desc = new CalculaDescontos();
		System.out.println("Seja bem vindo a empresa, por favor registre o seu nome e cpf :)");
		total++;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getNome() {
		if (this.nome == null | this.nome == "") {
			throw new RuntimeException("Você deve colocar um nome");
		}
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	public String getCpf() {
		if (this.cpf == null | this.cpf == "") {
			throw new RuntimeException("Você deve colocar um cpf");
		}
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}

}
