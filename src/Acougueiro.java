
public class Acougueiro extends Funcionarios {
	
	CalculaDescontos inss;
	
	public Acougueiro() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1507.00;
	}
	
  }	

