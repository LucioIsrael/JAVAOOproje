
public class CalculaINSS{

	private double numero;
	
	public boolean getInss(Funcionarios f) {
		double Salario = f.getSalario();
		if(Salario <= 1100.0) {
			double inss1 = Salario * 0.075;
			System.out.println("Será descontado 7,5% para o seu inss, você terá descontado "+
			inss1 +" E você receberá "+ (Salario - inss1));
			
		} else if(Salario > 1100.01 && Salario <= 2203.48) {
			double inss2 = Salario * 0.09;
			System.out.println("Será descontado 9% para o seu inss, você terá descontado "+ 
			inss2  +" E você receberá "+ (Salario - inss2));
			
		} else if(Salario > 2203.48 && Salario <= 3305.22) {
			double inss3 = Salario * 0.12;
			System.out.println("Será descontado 12% para o seu inss, você terá descontado "+
			inss3 +" E você receberá "+ (Salario - inss3));
			
		} else if(Salario > 3305.22 && Salario <= 6433.57) {
			double inss4 = Salario * 0.14;
			System.out.println("Será descontado 14% para o seu inss, você terá descontado "+
			inss4 +" E você receberá "+ (Salario - inss4) );
		}
		return false;
	}
}
