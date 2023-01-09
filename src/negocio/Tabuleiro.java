package negocio;

import java.util.*;

public class Tabuleiro {
	private List<Peca> pecas = new ArrayList<Peca>();
	private Peca pecaSelecionada1;
	private Peca pecaSelecionada2;
	private boolean resolvido;
	private String imagem;
	
	Tabuleiro() {
		pecaSelecionada1 = null;
		pecaSelecionada2 = null;
		resolvido = false;
	}
	
	public Tabuleiro(List<Peca> pecas, boolean resolvido){
		this.pecas = pecas;
		this.resolvido = resolvido;
		pecaSelecionada1 = null;
		pecaSelecionada2 = null;
	}

	public boolean selecionarPeca(int id) {
		Peca pecaASerSelecionada = this.pecas.stream()
			    .filter(peca -> id == peca.getId())
			    .findAny()
			    .orElse(null);
		if(pecaASerSelecionada != null && pecaASerSelecionada.isVazio() == false) {
			int posicaoPecaVazia = pecas.get(15).getPosicao();
			boolean pecaVaziaEhVizinha = posicaoPecaVazia - pecaASerSelecionada.getPosicao() == 1 || 
					posicaoPecaVazia - pecaASerSelecionada.getPosicao() == -1 || 
					posicaoPecaVazia - pecaASerSelecionada.getPosicao() == 4 || 
					posicaoPecaVazia - pecaASerSelecionada.getPosicao() == -4;
			if(pecaVaziaEhVizinha) {
				pecaSelecionada1 = pecaASerSelecionada;
				pecaSelecionada2 = pecas.get(15);
				movimentarPecas();
				return true;
			}
		}
		return false;
	}
	
	public void movimentarPecas() {
		int auxPosicao;
		auxPosicao = pecaSelecionada1.getPosicao();
		pecaSelecionada1.setPosicao(pecaSelecionada2.getPosicao());
		pecaSelecionada2.setPosicao(auxPosicao);
		pecaSelecionada1 = null;
		pecaSelecionada2 = null;
		if(this.checkIfPuzzleIsSolved()) {
			this.setResolvido();
		};
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
	
	public List<Peca> getPecas() {
		return this.pecas;
	}
	
	public void embaralharPar() {
		ArrayList<Integer> ordemPecas = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ordemPecas = Embaralhador.embaralhamentoPar(ordemPecas);
		this.pecas.clear();
		int i = 0;
		for( ;i < ordemPecas.size(); i++) {
			Peca peca = new Peca(i + 1, "", ordemPecas.get(i), false);
			this.pecas.add(peca);
		}
		this.pecas.add(new Peca(i + 1, "", 16, true));
	}
	
	public void embaralharImpar() {
		ArrayList<Integer> ordemPecas = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ordemPecas = Embaralhador.embaralhamentoImpar(ordemPecas);
		this.pecas.clear();
		int i = 0;
		for( ;i < ordemPecas.size(); i++) {
			Peca peca = new Peca(i + 1, "", ordemPecas.get(i), false);
			this.pecas.add(peca);
		}
		this.pecas.add(new Peca(i + 1, "", 16, true));
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
		for(int i = 0; i < pecas.size() - 1; i++) {
			pecas.get(i).setImagem("Img/"+imagem+"/"+pecas.get(i).getId()+".png");
		}
	}
	
	
}
