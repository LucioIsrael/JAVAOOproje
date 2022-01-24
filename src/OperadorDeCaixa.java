
public class OperadorDeCaixa extends Funcionarios{

	CalculaDescontos inss;
	
	public OperadorDeCaixa() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1228.00;
	}
	
}
