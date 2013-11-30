package ifes.poo1.xadrez.view.cci;

import ifes.poo1.xadrez.view.cih.Tela;

public class ControladorTelas {
	
	Tela tela = new Tela();
	
	public void controlarMenuInicial()
	{
		int opcao = 10;
		
		while(opcao >3 || opcao <1)
		{
			opcao = tela.menuInicial();
			switch(opcao)
			{
			case 1:
				controlarNovoJogo();
				break;
			case 2:
				controlarDadosPartidas();
				break;
			case 3:
				tela.mostrarMenuSair();
				break;
			default:
				tela.opcaoInvalida();
			}
		}
		
		
	}

	private void controlarDadosPartidas() 
	{
		tela.mostrarMenuDadosPartidas();	
	}

	public String[] controlarNovoJogo() 
	{
		int opcao = 10;
		String [] nomeJogadores = new String[2];

		while (opcao > 2 || opcao < 1) {
			opcao = tela.novoJogo();
			switch (opcao) {
			case 1:
				nomeJogadores = tela.singlePlayer();
				break;
			case 2:
				nomeJogadores = tela.multiPlayer();
				break;
			default:
				tela.opcaoInvalida();
			}
		}
		return nomeJogadores;
	}

}
