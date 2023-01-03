package negocio;

import java.util.List;

public class Tabuleiro {
	private List<Peca> pecas;
	private Peca pecaSelecionada1;
	private Peca pecaSelecionada2;
	private boolean resolvido;

	Tabuleiro(List<Peca> pecas ){
		this.pecas = pecas;
		resolvido = false;
	}
	
	public boolean verificarValidadeDoMovimento() {
		
		if(pecaSelecionada1.isVazio() || pecaSelecionada2.isVazio()) {
			int posicao1 = pecaSelecionada1.getPosicao();
			int posicao2 = pecaSelecionada2.getPosicao();
			int diferencaPosicoes = posicao1 - posicao2;
			return diferencaPosicoes == 1 || diferencaPosicoes == -1 || diferencaPosicoes == 4 || diferencaPosicoes == -4;
		}
		return false;
	}
	
	public void selecionarPeca(int id) {
		if(pecaSelecionada1 == null) {
			this.pecaSelecionada1 = this.pecas.stream()
		    .filter(peca -> id == peca.getId())
		    .findAny()
		    .orElse(null);
		} else {
			Peca pecaASerSelecionada = this.pecas.stream()
		    .filter(peca -> id == peca.getId())
		    .findAny()
		    .orElse(null);
			if(pecaASerSelecionada.equals(this.pecaSelecionada1)) {
				this.pecaSelecionada1 = null;
			} else if(this.pecaSelecionada1.isVazio() || pecaASerSelecionada.isVazio()){
				this.pecaSelecionada2 = pecaASerSelecionada;
			}
		}
	}
	
	public void movimentarPecas() {
		if( this.verificarValidadeDoMovimento() ) {
			int auxPosicao;
			auxPosicao = pecaSelecionada1.getPosicao();
			pecaSelecionada1.setPosicao(pecaSelecionada2.getPosicao());
			pecaSelecionada2.setPosicao(auxPosicao);
			if(this.checkIfPuzzleIsSolved()) {
				this.setResolvido();
			};
		}
	}
	
	public boolean checkIfPuzzleIsSolved() {
		return 	pecas.stream()
				.allMatch( peca -> {
					return peca.getId() == peca.getPosicao();
				});
	}
	
	private void setResolvido() {
		this.resolvido = true;
	}
	
	public boolean getResolvido() {
		return this.resolvido;
	}
	
	public void embaralharPar() {
		
	}
	
	public void embaralharImpar() {
		
	}
}
