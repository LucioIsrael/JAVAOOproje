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
		if(nome == null) {
			throw new RuntimeException("Você deve colocar seu nome");
		}
		this.nome = nome;	
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
}
