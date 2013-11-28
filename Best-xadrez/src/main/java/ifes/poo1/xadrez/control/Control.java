package ifes.poo1.xadrez.control;

import ifes.poo1.xadrez.model.jogador.Jogador;
import ifes.poo1.xadrez.model.tabuleiro.Tabuleiro;

public class Control {
	
	protected Tabuleiro tabuleiro = new Tabuleiro();
	private Jogador jBranco = new Jogador("branco");
	private Jogador jPreto = new Jogador("preto");
	
	public void ImprimeTab(){ 
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (tabuleiro.getCasas(j,i) == null) System.out.print("x");
		
				else System.out.print(tabuleiro.getCasas(j,i)); 
						
			}
			
			System.out.print("\n");
			
		}
	}
	
	
	public void controlarPeca(String comando){
		
		if (comando.length() > 4){ 
			System.out.println("Acima de 4 caracteres");
		}
		
		else{
			
			int posXin = Character.getNumericValue(comando.charAt(0));
			int posYin = Character.getNumericValue(comando.charAt(1));
			
			int posXfin = Character.getNumericValue(comando.charAt(2));
			int posYfin = Character.getNumericValue(comando.charAt(3));
			
			if (tabuleiro.getCasas(posXin, posYin).mover(posXin, posYin, posXfin, posYfin)){ 
				//pega a peça que está em posXin e posYin e verifica se ela pode mover para (posXfin,posYfin).
				tabuleiro.moverPeca(posXin, posYin, posXfin, posYfin);
			}
			
			else System.out.println("Não foi possível movimentar");
		}
		
	}
	
	
		
}
