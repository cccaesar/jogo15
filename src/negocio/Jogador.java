package negocio;

public class Jogador {
	private String apelido;
	private int codigo;
	private float pontos;
	
	public Jogador(String apelido, int codigo) {
		this.apelido = apelido;
		this.codigo = codigo;
		this.pontos = -1;
	}
	
	public Jogador(String apelido, int codigo, float pontos) {
		this.apelido = apelido;
		this.codigo = codigo;
		this.pontos = pontos;
	}


	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getCodigo() {
		return codigo;
	}
	public float getPontos() {
		return pontos;
	}

	protected void setPontos(float pontos) {
		this.pontos = pontos;
	}
	
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
