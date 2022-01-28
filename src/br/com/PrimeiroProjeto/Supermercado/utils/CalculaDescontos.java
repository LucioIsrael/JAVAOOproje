
/**
 * 
 * Classe criada para guardar os metodos que imprimem descontos dos funcionarios
 * 
 * @author Lúcio Israel
 * 
 */


package br.com.PrimeiroProjeto.Supermercado.utils;

import br.com.PrimeiroProjeto.Supermercado.domain.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculaDescontos {

	static double inss;
	static double vt;
	static double saude;

	private DecimalFormat formatador = new DecimalFormat("0.00");

	public boolean setInss(Funcionarios f) {
		double Salario = f.getSalario();
		if (Salario <= 1100.0) {
			inss = Salario - (Salario * 0.075);
			System.out.println(
					"Será descontado 7,5% que equivale a " + formatador.format(inss) + " do seu salário para o inss");

		} else if (Salario > 1100.01 && Salario <= 2203.48) {
			inss = Salario * 0.09;
			System.out.println(
					"Será descontado 9% que equivale a " + formatador.format(inss) + " do seu salário para o inss");

		} else if (Salario > 2203.48 && Salario <= 3305.22) {
			inss = Salario * 0.12;
			System.out.println(
					"Será descontado 12% que equivale a " + formatador.format(inss) + " do seu salário para o inss");

		} else if (Salario > 3305.22) {
			inss = Salario * 0.14;
			System.out.println(
					"Será descontado 14% que equivale a " + formatador.format(inss) + " do seu salário para o inss");
		}
		return false;
	}

	public void Saude(Funcionarios f) {
		String saudePlano = JOptionPane.showInputDialog("Você gostaria de ter o Plano de saude ? SIM OU NÃO");
		if ("SIM".equalsIgnoreCase(saudePlano)) {
			boolean check = true;
			while (check != false) {
				String disseSim = JOptionPane.showInputDialog("Qual dos dois planos você gostaria de aderir ?" + "\n"
						+ "Digite 1 caso queira o completo ou 2 para o simples");
				if ("1".equalsIgnoreCase(disseSim)) {
					String escolheu1 = JOptionPane.showInputDialog("Você terá descontado 100 reais do seu salário"
							+ "\n" + "Digite SIM para confirmar ou NÃO para cancelar");
					if ("SIM".equalsIgnoreCase(escolheu1)) {
						saude = -100;
						check = false;

					} else if ("NÃO".equalsIgnoreCase(escolheu1)) {
						check = false;
					}
				}
				if ("2".equalsIgnoreCase(disseSim)) {
					String escolheu2 = JOptionPane.showInputDialog("Você terá descontado 30 reais do seu salário" + "\n"
							+ "Digite SIM para confirmar ou NÃO para cancelar");
					if ("SIM".equalsIgnoreCase(escolheu2)) {
						saude = - -30;
						check = false;

					} else if ("NÃO".equalsIgnoreCase(escolheu2)) {
						check = false;
					}
				}
			}
		}
	}

	public void DescontoTransporte(Funcionarios f) {
		String areyousure = JOptionPane.showInputDialog("Você gostaria de ter o vale transporte ? SIM OU NÃO");
		if ("SIM".equalsIgnoreCase(areyousure)) {
			double Salario = f.getSalario();
			vt = Salario * 0.06;
			System.out.println("Será descontado 6% que equivale a " + formatador.format(vt)
					+ " do seu salário para o vale transporte");
		}

	}

	/**
	 * Criei este getter para puxar o salário liquido dos funcionarios
	 * eu não soube colocar ela em outro local então introduzi na classe de
	 * calcular
	 * 
	 * 
	 * Se eu fosse recriar esse código provavelmente teria criado uma classe separada
	 * usando o calcula desconto como classe mãe para puxar as variaveis
	 * e tentar realizar o calculo.
	 * 
	 * @author Lúcio Israel
	 */
	
	public void getSalarioLiquido(Funcionarios f) {
		if (inss > 0) {
			double Salario = f.getSalario();
			double salarioLiquido = (Salario - inss - vt) + saude;
			System.out.println("O seu salário liquido é de " + formatador.format(salarioLiquido));
		} else {
			System.out.println("Você deve acionar seu Inss para ter acesso ao seu salário liquido");
		}

	}

}
