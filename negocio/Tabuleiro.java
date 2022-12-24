package negocio;

import java.util.List;

public class Tabuleiro {
	private List<Peca> pecas;
	private Peca pecaSelecionada1;
	private Peca pecaSelecionada2;
	private boolean encerrado;

	public boolean validaMovimento() {
		
		if(pecaSelecionada1.isVazio() || pecaSelecionada2.isVazio()) {
			int linha1 = pecaSelecionada1.getLinha();
			int linha2 = pecaSelecionada2.getLinha();
			int coluna1 = pecaSelecionada1.getColuna();
			int coluna2 = pecaSelecionada2.getColuna();
			if(linha1 == linha2) {
				int diferencaColuna = coluna1 - coluna2;
				if(diferencaColuna * diferencaColuna == 1) {
					return true;
				}
			} else if(coluna1 == coluna2) {
				int diferencaLinha = linha1 - linha2;
				if(diferencaLinha * diferencaLinha == 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void selecionarPeca(int id) throws Exception {
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
		if( this.validaMovimento() ) {
			int auxLinha, colunaAux;
			auxLinha = pecaSelecionada1.getLinha();
			colunaAux = pecaSelecionada1.getColuna();
			pecaSelecionada1.setLinha(pecaSelecionada2.getLinha());
			pecaSelecionada1.setColuna(pecaSelecionada2.getColuna());
			pecaSelecionada2.setLinha(auxLinha);
			pecaSelecionada2.setColuna(colunaAux);
			if(this.checkIfPuzzleIsSolved()) {
				this.setEncerrado();
			};
		}
	}
	
	public boolean checkIfPuzzleIsSolved() {
		return 	pecas.stream()
				.allMatch( peca -> {
					return peca.getId() == peca.getPosicao();
				});
	}
	
	public void embaralhar() {
		
	}
	
	private void setEncerrado() {
		this.encerrado = true;
	}
}
