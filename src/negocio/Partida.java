package negocio;

import java.util.ArrayList;
import java.util.List;

import conexaoBanco.JogadorDAO;

public class Partida {
	private List<Jogador> jogadores = new ArrayList<Jogador>();;
	private Tabuleiro tabuleiro;
	private Cronometro cronometro;

	private int vez;
	private JogadorDAO jogadorDAO;

	public Partida(Tabuleiro tabuleiro, int vez) {
		this.vez = vez;
		this.tabuleiro = tabuleiro;
		try {
			jogadorDAO = new JogadorDAO();
			jogadorDAO.createJogadorTable();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Partida(Jogador jogador, boolean emparalhamentoImpar) throws Exception{
		try {
			jogadorDAO = new JogadorDAO();
			jogadorDAO.createJogadorTable();	
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		try {
			this.addJogador(jogador);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		this.cronometro = new Cronometro();
		this.tabuleiro = new Tabuleiro();
		this.vez = 0;
		if(emparalhamentoImpar) {
			tabuleiro.embaralharImpar();
		} else {
			tabuleiro.embaralharPar();
		}
		cronometro.inciarContagem();
	}
	
	public void pontuar() {
		//Categoria 1 -> pontuacao do vencendor em 59 segundos
		//Categoria 2 -> pontuacao do vencendor entre 60 segundos e 599 segundos 
		//Categoria 3 -> pontuacao do vencendor entre 600 segundos e 5999 segundos 
		
		//Pontos alterados para 1000 devido a Categoria 1, a medida que o tempo passa a pontuacao muda
		jogadores.get(vez).setPontos(1000);
		

		while(jogadores.get(vez).getPontos() != 0) {

		
			if(cronometro.getTempoDecorrido() < 60) {
				// Categoria 1
				
				jogadores.get(vez).setPontos(jogadores.get(vez).getPontos() +  (59 - cronometro.getTempoDecorrido()) * (50/3));
			}
		
			if(cronometro.getTempoDecorrido() >= 60 && cronometro.getTempoDecorrido() < 599) {
				// Categoria 2
				
				jogadores.get(vez).setPontos(100);
				long tempoDeSobra = 599 - cronometro.getTempoDecorrido() - 59;
				
				// Subtraido os 59 segundos iniciais, por nao fazerem parte da nova categoria de pontuacao
				
				jogadores.get(vez).setPontos( jogadores.get(vez).getPontos() + (tempoDeSobra * 6));
			}
			
				//Adicionando novamente 59 segundos, para que a verificacao do tempo seja correta
			
		
			if(cronometro.getTempoDecorrido() >= 600 && cronometro.getTempoDecorrido() < 5999) {
				//Categoria 3
				// Subtraido os 599 segundos intermediarios, por nao fazerem parte da nova categoria de pontuacao
				long tempoDeSobra = 5999 - cronometro.getTempoDecorrido() - 599;
				jogadores.get(vez).setPontos(10);
				
				jogadores.get(vez).setPontos( jogadores.get(vez).getPontos() + (tempoDeSobra * 1/600));
			}
		}

	}
	
	public boolean verificarVitoria() {
		if(getTabuleiro().getResolvido()) {
			cronometro.pausarContagem();
			this.pontuar();
			if(this.vez < this.jogadores.size() - 1) {
				this.vez++;
			} else {
				//Mandar a interface exibir o placar da partida e depois o hist�rico
			}
			return true;
		}
		return false;
	}
	
	public void addJogador(Jogador jogador) throws Exception {
		System.out.println(jogadores.size());
		if(jogadores.size() < 3) {
			try {
				int codigo = jogadorDAO.insertJogador(jogador);
				jogador.setCodigo(codigo);
				jogadores.add(jogador);
			} catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
		} else {
			throw new Exception("Partida possui o maximo de jogadores");
		}
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public Cronometro getCronometro() {
		return this.cronometro;
	}
	
	public int getVez() {
		return vez;
	}
	
	public void pausarPartida() {
		cronometro.pausarContagem();
	}


	
}