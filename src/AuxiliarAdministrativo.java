
public class AuxiliarAdministrativo extends Funcionarios {

	CalculaDescontos inss;
	
	public AuxiliarAdministrativo() {
		this.inss = new CalculaDescontos();
	}
	
	public double getSalario() {
		return super.getSalario() + 1507.00;
	}
}
