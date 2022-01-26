import domain.*;

public class TesteConta {
	
	public static void main(String[] args) {
		Gerente ac = new Gerente("Lúcio","37283-3");
		ac.desc.setInss(ac);
		ac.desc.Saude(ac);
		ac.desc.DescontoTransporte(ac);
		ac.desc.getSalarioLiquido(ac);
		
	}	
}
