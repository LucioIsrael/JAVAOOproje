
public class Confeiteiro extends Funcionarios {

	CalculaDescontos inss;
	
	public Confeiteiro() {
		this.inss = new CalculaDescontos();
	}
	public double getSalario() {
		return super.getSalario() + 1271.00;
	}
}
