
public class Gerente extends Funcionarios {

	CalculaDescontos inss;
	
	public Gerente() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 4670.00;
	}
	
}
