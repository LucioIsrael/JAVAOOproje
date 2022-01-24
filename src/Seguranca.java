
public class Seguranca extends Funcionarios {

	CalculaDescontos inss;
	
	public Seguranca() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1539.00;
	}
	
}
