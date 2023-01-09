package negocio;

import java.time.Duration;
import java.time.Instant;

public class Cronometro {
	private Instant inicio;
	private Instant fim;
	private long tempoDecorrido;
	
	public Cronometro() {
		this.tempoDecorrido = 0;
	}
	
	public void iniciarContagem() {
		this.inicio = Instant.now();
	}
	
	public void pausarContagem() {
		this.fim = Instant.now();
		try {
			adicionarTempoDecorrido();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reiniciarContagem() {
		iniciarContagem();
		this.fim = null;
		tempoDecorrido = 0;
	}
	
	private void adicionarTempoDecorrido() throws Exception {
		if(this.inicio == null || this.fim == null) {
			throw new Exception("Não é possivel calcular o tempo decorrido, pois inicio ou fim são nulos.");
		}
		this.tempoDecorrido += Duration.between(this.inicio, this.fim).toSeconds();
		this.inicio = null;
		this.fim = null;
	}
	
	public long getTempoDecorrido() {
		return this.tempoDecorrido;
	}
	
	public boolean getContagemAcabou() {
		return (inicio == null && fim == null);
	}
	
	public boolean estaPausado() {
		return fim == null && inicio == null;
	}
}
