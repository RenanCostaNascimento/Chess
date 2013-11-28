package ifes.poo1.xadrez.model.main;

import ifes.poo1.xadrez.control.Control;

public class Main {

	public static void main(String[] args) {
		Control control = new Control();
		control.controlarPeca("2053");
		control.controlarPeca("2042");
		control.ImprimeTab();

	}

}
