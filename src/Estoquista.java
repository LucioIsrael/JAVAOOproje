
public class Estoquista extends Funcionarios {

	CalculaINSS inss;
	
	public Estoquista() {
		setSalario(1315.00);
		this.inss = new CalculaINSS();
	}
	
}
