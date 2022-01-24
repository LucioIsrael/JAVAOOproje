
public class Empacotador extends Funcionarios {
	
	CalculaDescontos inss;
	
	public Empacotador() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1100.00;
	}
	
}
