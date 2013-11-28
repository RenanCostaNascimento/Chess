package ifes.poo1.xadrez.model.pecas;

public class Cavalo extends Pecas {
	private int valor = 3;
	
	public Cavalo(String cor) {
		super(cor);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return "C";
		
	}
	
	@Override
	public boolean mover(int xIn, int yIn, int xFin, int yFin) {
		
		return false;
		
	}

	
}
