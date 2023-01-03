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
	
	public void inciarContagem() {
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
	
	//To-do deletar esse metodo 
	public void reiniciarContagem() {
		inciarContagem();
		this.fim = null;
		tempoDecorrido = 0;
	}
	
	public void adicionarTempoDecorrido() throws Exception {
		if(this.inicio == null || this.fim == null) {
			throw new Exception("N�o � possivel calcular o tempo decorrido, pois inicio ou fim s�o nulos.");
		}
		this.tempoDecorrido += Duration.between(this.inicio, this.fim).toSeconds();
		this.inicio = null;
		this.fim = null;
	}
	
	public long getTempoDecorrido() {
		return this.tempoDecorrido;
	}
}