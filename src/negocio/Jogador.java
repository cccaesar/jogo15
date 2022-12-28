package negocio;

public class Jogador {
	private String apelido;
	private int codigo;
	private float pontos;
	
	Jogador(String apelido, int codigo) {
		this.apelido = apelido;
		this.codigo = codigo;
		this.pontos = 0;
	}
	
	public String getApelido() {
		return apelido;
	}
	public int getCodigo() {
		return codigo;
	}
	public float getPontos() {
		return pontos;
	}
	
}
