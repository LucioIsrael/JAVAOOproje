import domain.*;

public class TesteConta {
	
	public static void main(String[] args) {
		Gerente ac = new Gerente();
		ac.setNome("Lúcio");
		System.out.println(ac.getSalario());

		
		Seguranca sc = new Seguranca();
		System.out.println(ac.getTotalFuncionarios());
	}	
}
