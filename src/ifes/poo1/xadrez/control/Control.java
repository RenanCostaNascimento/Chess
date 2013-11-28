package ifes.poo1.xadrez.control;

import ifes.poo1.xadrez.model.jogador.Jogador;
import ifes.poo1.xadrez.model.tabuleiro.Tabuleiro;

public class Control {
	
	private Tabuleiro tabuleiro = new Tabuleiro();
	private Jogador jBranco = new Jogador("branco");
	private Jogador jPreto = new Jogador("preto");
	
	public void moverPeca(String comando){
		int posXin = Character.getNumericValue(comando.charAt(0));
		int posYin = Character.getNumericValue(comando.charAt(1));
		
		int posXfin = Character.getNumericValue(comando.charAt(2));
		int posYfin = Character.getNumericValue(comando.charAt(3));
		
		(tabuleiro.getCasas(posXin, posYin)).mover(posXin, posYin, posXfin, posYfin);
		
	}
	
	
		
}
