package negocio;

public class Peca {
	private int valor;
	private String imagem;
	private int linha, coluna;
	private boolean estaVazio;
	
	public Peca(int valor, String imagem, int linha, int coluna, boolean estaVazio) {
		super();
		this.valor = valor;
		this.imagem = imagem;
		this.linha = linha;
		this.coluna = coluna;
		this.estaVazio = estaVazio;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
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
	
	
	

}
