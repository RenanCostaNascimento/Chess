package ifes.poo1.xadrez.model.jogador;

import ifes.poo1.xadrez.model.pecas.Pecas;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private String cor;
	private int vitorias;
	private int derrotas;
	private ArrayList<Pecas> pecasComidas = new ArrayList<Pecas>();
	
	public Jogador(String cor){
		this.cor = cor;
	}
	
	
	public int getPontuacao() {
		int soma = 0;
		//todo
		//somar os valores de cada peça da lista "pecasComidas"
		return soma;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
