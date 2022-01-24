
public class AuxiliarAdministrativo extends Funcionarios {

	CalculaINSS inss;
	
	public AuxiliarAdministrativo() {
		setSalario(1375.00);
		this.inss = new CalculaINSS();
	}
	
}
