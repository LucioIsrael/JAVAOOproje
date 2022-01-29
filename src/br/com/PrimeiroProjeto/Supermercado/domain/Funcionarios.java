
/**
 * Classe que guarda todos os funcionarios e suas informações
 * 
 * @author Lúcio Israel
 * 
 */

package br.com.PrimeiroProjeto.Supermercado.domain;

import br.com.PrimeiroProjeto.Supermercado.utils.*;

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
		String nomeUpper = nome.toUpperCase();
		this.nome = nomeUpper;

	}
		
	public String getNome() {
		if (this.nome == null | this.nome == "") {
			throw new RuntimeException("Você deve colocar um nome");
		}
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		String cpfSemEspaco = cpf.trim();
		this.cpf = cpfSemEspaco;
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
	
	public String toString() {
		return "Nome: " + this.nome + ", CPF: " + this.cpf + ", Salário: "
				+ getSalario();
	}

}
