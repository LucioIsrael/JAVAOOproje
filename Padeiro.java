
public class Padeiro extends Funcionarios {

	CalculaINSS inss;
	
	public Padeiro() {
		setSalario(1271.00);
		this.inss = new CalculaINSS();
	}
	
}
