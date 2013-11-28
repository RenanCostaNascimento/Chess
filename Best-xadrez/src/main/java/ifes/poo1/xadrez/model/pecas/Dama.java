package ifes.poo1.xadrez.model.pecas;

public class Dama extends Pecas {
	private int valor = 9;
	
	public Dama(String cor) {
		super(cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "D";
	}

	@Override
	public boolean mover(int xIn, int yIn, int xFin, int yFin) {
		return false;
		
	}

	

}
