
public class Estoquista extends Funcionarios {

	CalculaDescontos inss;
	
	public Estoquista() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1315.00;
	}
	
}