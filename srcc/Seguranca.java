
public class Seguranca extends Funcionarios {

	CalculaINSS inss;
	
	public Seguranca() {
		setSalario(1539.00);
		this.inss = new CalculaINSS();
	}
	
}
