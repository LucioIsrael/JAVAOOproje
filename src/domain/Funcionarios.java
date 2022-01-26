package domain;

import utils.CalculaDescontos;

public abstract class Funcionarios {

	private String nome;
	private String cpf;
	private double salario = 0.0;
	private double salarioLiquido;
	
	public CalculaDescontos desc;
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Funcionarios(String nome, String cpf) {
		this.desc = new CalculaDescontos();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		if(nome == null) {
			throw new NullPointerException("Você deve colocar seu nome");
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
		return salario;
	}
	
}
