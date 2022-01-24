
public class Padeiro extends Funcionarios {

	CalculaDescontos inss;
	
	public Padeiro() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1271.00;
	}
	
}
