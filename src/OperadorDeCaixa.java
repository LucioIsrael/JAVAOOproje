
public class OperadorDeCaixa extends Funcionarios{

	CalculaINSS inss;
	
	public OperadorDeCaixa() {
		setSalario(1228.00);
		this.inss = new CalculaINSS();
	}
	
}
