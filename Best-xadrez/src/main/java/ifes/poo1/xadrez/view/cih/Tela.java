package ifes.poo1.xadrez.view.cih;

import java.util.Scanner;

public class Tela {
	
	Scanner scanner = new Scanner(System.in);
	
	public int menuInicial()
	{
		System.out.println("1. Iniciar uma nova partida\n"
				+ "2. Dados das partidas\n"
				+ "3. Sair");
		return scanner.nextInt();
	}
	
	public int novoJogo()
	{
		System.out.println("1. Singleplayer\n"
				+ "2. Multiplayer");
		return scanner.nextInt();
	}
	
	public String[] singlePlayer()
	{
		String nomeJogadores[] = new String[2] ;
		
		System.out.println("Digite seu nome, jogador branco:");
		nomeJogadores[0] = scanner.next();
		System.out.println("Seu oponente, o jogador preto, se chamara ZEUS!");
		nomeJogadores[1] = "ZEUS";
		
		return nomeJogadores;
	}
	
	public String[] multiPlayer()
	{
		String nomeJogadores[] = new String[2] ;
		
		System.out.println("Digite seu nome, jogador branco:");
		nomeJogadores[0] = scanner.next();
		System.out.println("Digite seu nome, jogador preto:");
		nomeJogadores[1] = scanner.next();
		
		return nomeJogadores;
	}
	
	public void opcaoInvalida() 
	{
		System.out.println("Digite um numero dentre as opcoes possiveis!");
	}

	public void mostrarMenuSair() {
		System.out.println("------- GAME OVER -------");
		
	}

	public void mostrarMenuDadosPartidas() {
		// TODO Auto-generated method stub
		
	}
	
	public void exibirMensagem(String mensagem)
	{
		System.out.println(mensagem);
	}

}
