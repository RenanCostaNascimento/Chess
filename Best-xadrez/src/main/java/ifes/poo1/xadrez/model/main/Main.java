package ifes.poo1.xadrez.model.main;

import ifes.poo1.xadrez.control.Control;

public class Main {

	public static void main(String[] args) {
		Control control = new Control();
		control.moverPeca("0605");
		control.ImprimeTab();

	}

}
