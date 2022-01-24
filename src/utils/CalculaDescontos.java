package utils;
//Criar uma forma de puxar o valor liquido e tornar opcional o vale transporte e
//Outros serviços

import java.text.DecimalFormat;
import domain.Funcionarios;

public class CalculaDescontos {

	private DecimalFormat formatador = new DecimalFormat("0.00");
	
	public boolean Inss(Funcionarios f) {
		double Salario = f.getSalario();
		if(Salario <= 1100.0) {
			double inss1 = Salario * 0.075;
			System.out.println("Será descontado 7,5% que equivale a "+
			formatador.format(inss1) + " do seu salário para o inss");
			
		} else if(Salario > 1100.01 && Salario <= 2203.48) {
			double inss2 = Salario * 0.09;
			System.out.println("Será descontado 9% que equivale a "+ 
			formatador.format(inss2)+ " do seu salário para o inss");
			
		} else if(Salario > 2203.48 && Salario <= 3305.22) {
			double inss3 = Salario * 0.12;
			System.out.println("Será descontado 12% que equivale a "+
			formatador.format(inss3)+ " do seu salário para o inss");
			
		} else if(Salario > 3305.22) {
			double inss4 = Salario * 0.14;
			System.out.println("Será descontado 14% que equivale a "+
			formatador.format(inss4) + " do seu salário para o inss");
		}
		return false;
	}
	
	public void getTransporte (Funcionarios f) {
		double VT = f.getSalario() * 0.06;
		System.out.println("Será descontado 6% que equivale a "
		+ formatador.format(VT)+" do seu salário para o vale transporte");
	}
}

