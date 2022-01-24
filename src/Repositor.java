
public class Repositor extends Funcionarios {

	CalculaDescontos inss;
	
	public Repositor() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1189.00;
	}
	
}
