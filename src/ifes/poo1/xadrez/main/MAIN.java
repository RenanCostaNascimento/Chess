package ifes.poo1.xadrez.main;


import ifes.poo1.xadrez.model.pecas.Cavalo;
import ifes.poo1.xadrez.model.pecas.Peao;
import ifes.poo1.xadrez.model.pecas.Pecas;
import ifes.poo1.xadrez.model.tabuleiro.Tabuleiro;


public class MAIN {

	public static void main(String[] args) {
//		View visao = new View();
//		visao.ImprimeTab();
		
		Tabuleiro tab = new Tabuleiro();
		
		tab.moverPeca(0, 0, 0, 3);
		
		tab.ImprimeTab();
		
		
		

		
		
		
	}

}
