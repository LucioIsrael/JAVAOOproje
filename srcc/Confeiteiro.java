
public class Confeiteiro extends Funcionarios {

	CalculaINSS inss;
	
	public Confeiteiro() {
		setSalario(1271.00);
		this.inss = new CalculaINSS();
	}
	
}
