package negocio;

public class Partida {
	private Jogador jogador;
	private Tabuleiro tabuleiro;
	private Cronometro cronometro;

	
	Partida(Jogador jogador, boolean emparalhamentoImpar){
		this.jogador = jogador;
		this.cronometro = new Cronometro();
		if(emparalhamentoImpar) {
			embaralharImpar();
		} else {
			embaralharPar();
		}
		cronometro.inciarContagem();
	}
	
	public void pontuar() {
		//Categoria 1 -> pontuacao do vencendor em 59 segundos
		//Categoria 2 -> pontuacao do vencendor entre 60 segundos e 599 segundos 
		//Categoria 3 -> pontuacao do vencendor entre 600 segundos e 5999 segundos 
		
		//Pontos alterados para 1000 devido a Categoria 1, a medida que o tempo passa a pontuacao muda
		jogador.setPontos(1000);
		
		while(jogador.getPontos() != 0) {
		
			if(cronometro.getTempoDecorrido() < 60) {
				// Categoria 1
				
				jogador.setPontos(jogador.getPontos() +  (59 - cronometro.getTempoDecorrido()) * (50/3));
			}
		
			if(cronometro.getTempoDecorrido() >= 60 && cronometro.getTempoDecorrido() < 599) {
				// Categoria 2
				
				jogador.setPontos(100);
				long tempoDeSobra = 599 - cronometro.getTempoDecorrido() - 59;
				
				// Subtraido os 59 segundos iniciais, por nao fazerem parte da nova categoria de pontuacao
				
				jogador.setPontos( jogador.getPontos() + (tempoDeSobra * 6));
			}
			
				//Adicionando novamente 59 segundos, para que a verifica��o do tempo seja correta
			
		
			if(cronometro.getTempoDecorrido() >= 600 && cronometro.getTempoDecorrido() < 5999) {
				//Categoria 3
				// Subtraido os 599 segundos intermediarios, por nao fazerem parte da nova categoria de pontuacao
				long tempoDeSobra = 5999 - cronometro.getTempoDecorrido() - 599;
				jogador.setPontos(10);
				
				jogador.setPontos( jogador.getPontos() + (tempoDeSobra * 1/600));
			}
			
		}

	}
	
	public void embaralharPar() {

	}
	
	public void embaralharImpar() {
		
	}
	
	public boolean verificarVitoria() {
		if(getTabuleiro().getResolvido()) {
			cronometro.pausarContagem();
			this.pontuar();
			return true;
		}
		return false;
	}
	
	public Jogador getJogador() {
		return jogador;
	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public Cronometro getCronometro() {
		return this.cronometro;
	}
	
	public void pausarPartida() {
		cronometro.pausarContagem();
	}
}
