import domain.*;

public class TesteConta {
	
	public static void main(String[] args) {
		Gerente ac = new Gerente();
		System.out.println(ac.getSalario());
		ac.desc.setInss(ac);
		ac.desc.setSaude(ac);
		ac.desc.getSalarioLiquido(ac);

	}	
}
