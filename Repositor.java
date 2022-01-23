
public class Repositor extends Funcionarios {

	CalculaINSS inss;
	
	public Repositor() {
		setSalario(1189.00);
		this.inss = new CalculaINSS();
	}
	
}
