package negocio;

public class Partida {
	private Jogador jogador;
	private Tabuleiro tabuleiro;
	private Relogio relogio;
	
	Partida(Jogador jogador, boolean emparalhamentoImpar){
		this.jogador = jogador;
		if(emparalhamentoImpar) {
			embaralharImpar();
		} else {
			embaralharPar();
		}
	}
	
	public void pontuar(Jogador jogador) {
		//Categoria 1 -> pontuacao do vencendor em 59 segundos
		//Categoria 2 -> pontuacao do vencendor entre 60 segundos e 599 segundos 
		//Categoria 3 -> pontuacao do vencendor entre 600 segundos e 5999 segundos 
		
		//Pontos alterados para 1000 devido a Categoria 1, a medida que o tempo passa a pontuacao muda
		
		jogador.setPontos(1000);
		
		while(jogador.getPontos() != 0) {
		
			if(relogio.getSegundos()<60) {
				// Categoria 1
				
				jogador.setPontos(jogador.getPontos() +  (59 - relogio.getSegundos()) * (50/3));
			}
		
			if(relogio.getSegundos() >= 60 && relogio.getSegundos() < 599) {
				// Categoria 2
				
				int tempoDeSobra = relogio.getSegundos() - 59;
				jogador.setPontos(100);

				jogador.setPontos( jogador.getPontos() + ((599 - tempoDeSobra) * 6));
			}
			
			if(relogio.getSegundos() >= 600 && relogio.getSegundos() < 5999) {
				//Categoria 3	
				
				int tempoDeSobra = relogio.getSegundos() - 599;
				jogador.setPontos(10);
				
				jogador.setPontos( jogador.getPontos() +  (5999 -tempoDeSobra) * 1/600);
			}
		}
	}
	
	public void embaralharPar() {

	}
	
	public void embaralharImpar() {
		
	}
	
	public boolean verificarVitoria() {
		if(verificarVitoria() == true) {
			
		}
		return false;
		
	}
	
	public Jogador getJogador() {
		return jogador;
	}
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	public Relogio getRelogio() {
		return relogio;
	}
	
}