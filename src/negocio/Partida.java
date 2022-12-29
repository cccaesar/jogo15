package negocio;

import java.util.ArrayList;

public class Partida {
	private ArrayList<Jogador> jogadores;
	private Tabuleiro tabuleiro;
	
	Partida(ArrayList<Jogador> jogadores, boolean emparalhamentoImpar){
		this.jogadores = jogadores;
		if(emparalhamentoImpar) {
			embaralharImpar();
		} else {
			embaralharPar();
		}
	}
	
	
	public void embaralharPar() {
		
	}
	
	public void embaralharImpar() {
		
	}
	
	public ArrayList<Jogador> getJogador() {
		return jogadores;
	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
