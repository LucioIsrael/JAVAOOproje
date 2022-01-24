
public class Empacotador extends Funcionarios {
	
	CalculaINSS inss;
	
	public Empacotador() {
		setSalario(861.00);
		this.inss = new CalculaINSS();
	}
	
}
