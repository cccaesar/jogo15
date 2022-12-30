package negocio;

import java.util.ArrayList;

public class Partida {
	private Jogador jogador;
	private Tabuleiro tabuleiro;
	
	Partida(Jogador jogador, boolean emparalhamentoImpar){
		this.jogador = jogador;
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
	
	public Jogador getJogador() {
		return jogador;
	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
