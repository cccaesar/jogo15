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
	
	public Jogador(String apelido, int codigo, double pontos) {
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
	public double getPontos() {
		return pontos;
	}

	protected void setPontos(double pontos) {
		this.pontos = pontos;
	}
	

}
