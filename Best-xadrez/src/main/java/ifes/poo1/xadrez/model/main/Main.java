package ifes.poo1.xadrez.model.main;

import ifes.poo1.xadrez.control.Control;

public class Main {

	public static void main(String[] args) {
		Control control = new Control();
		control.controlarPeca("0605");
                control.controlarPeca("0506");
               
		control.ImprimeTab();

	}

}
