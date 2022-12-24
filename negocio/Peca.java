package negocio;

public class Peca {
	private int id;
	private String imagem;
	private int linha, coluna;
	private boolean estaVazio;
	
	public Peca(int id, String imagem, int linha, int coluna, boolean estaVazio) {
		super();
		this.id = id;
		this.imagem = imagem;
		this.linha = linha;
		this.coluna = coluna;
		this.estaVazio = estaVazio;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public boolean isVazio() {
		return this.estaVazio;
	}
	
	public int getPosicao() {
		int posicao = getColuna() + (4 * (getLinha() - 1));
		return posicao;
	}
	

}
