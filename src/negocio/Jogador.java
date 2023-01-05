package negocio;

public class Jogador {
	private String apelido;
	private int codigo;
	private double pontos;
	
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
	public int getCodigo() {
		return codigo;
	}
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

}
