package ui;

import javax.swing.JPanel;

import negocio.Peca;

public class JPeca extends JPanel {
	
	private Peca peca;
	
	private int posicao;
	
	public JPeca(int posicao) {
		this.posicao = posicao;
	}
	
	public JPeca(Peca peca) {
		this.peca = peca;
		this.posicao = peca.getPosicao();
		
	}

}
