package negocio;

public class Peca {
	private int id;
	private String imagem;
	private int posicao;
	private boolean estaVazio;
	
	public Peca(int id, String imagem, int posicao, boolean estaVazio) {
		super();
		this.id = id;
		this.imagem = imagem;
		this.posicao = posicao;
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
	
	public boolean isVazio() {
		return this.estaVazio;
	}
	
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public int getPosicao() {
		return posicao;
	}
	

}
