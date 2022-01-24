
public class Gerente extends Funcionarios {

	CalculaINSS inss;
	
	public Gerente() {
		setSalario(4670.00 );
		this.inss = new CalculaINSS();
	}
	
}
