package ifes.poo1.xadrez.model.tabuleiro;



import ifes.poo1.xadrez.model.pecas.*;


public class Tabuleiro {
	
	
	
	private Pecas[][] casas = new Pecas[8][8];

		
	//o metódo construtor insere as peças no tabuleiro	
	public Tabuleiro(){
		
		//inserindo os peões
		for (int i = 0; i < 8; i++) {
			Pecas peao = new Peao("branco");
			casas[1][i] = peao;
			peao = new Peao("preto");
			casas[6][i] = peao;
			
		} 
		
		//inserindo as torres
		Pecas torre = new Torre("branco");
		casas[0][0] = torre;
		torre = new Torre("branco");
		casas[0][7] = torre;
		torre = new Torre("preto");
		casas[7][0] = torre;
		torre = new Torre("preto");
		casas[7][7] = torre;
		
		//inserindo os cavalos
		Pecas cavalo = new Cavalo("branco");
		casas[0][1] = cavalo;
		cavalo = new Cavalo("branco");
		casas[0][6] = cavalo;
		cavalo = new Cavalo("preto");
		casas[7][1] = cavalo;
		cavalo = new Cavalo("preto");
		casas[7][6] = cavalo;
		
		
		//inserindo os bispos
		Pecas bispo = new Bispo("branco");
		casas[0][2] = bispo;
		bispo = new Bispo("branco");
		casas[0][5] = bispo;
		bispo = new Bispo("preto");
		casas[7][2] = bispo;
		bispo = new Bispo("preto");
		casas[7][5] = bispo;
		
		//inserindo rei e dama
		Pecas rei = new Rei("branco");
		casas[0][4] = rei;
		rei = new Rei("preto");
		casas[7][4] = rei;
		
		Pecas dama = new Dama("branco");
		casas[0][3] = dama;
		dama = new Dama("preto");
		casas[7][3] = dama;
		
		
		
	}

	public Pecas getCasas(int x, int y) {
		return casas[y][x];
	}

	public void setCasas(Pecas peca, int x, int y) {
		this.casas[y][x] = peca;
	}

	public void ImprimeTab(){ 
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (this.getCasas(j,i) == null) System.out.print("x");
		
				else System.out.print(this.getCasas(j,i)); 
						
			}
			
			System.out.print("\n");
			
		}
	}
	
	public void moverPeca(int xIn, int yIn, int xFin, int yFin){
		Pecas peca = this.getCasas(xIn,yIn);
		this.setCasas(peca, xFin, yFin);
		this.setCasas(null, xIn, yIn);
		
		
		
	}
	
	
		
		
		
	
}
