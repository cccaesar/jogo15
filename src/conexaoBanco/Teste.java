package conexaoBanco;

import negocio.Jogador;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JogadorDAO jdao = new JogadorDAO();
		Jogador j1,j2;
		try {
			jdao.insertJogador(new Jogador( "teste dois",  11));
			j1 = jdao.getJogador("teste");
			j2 = jdao.getJogador("teste dois");
			jdao.updateJogadorPontos(20, j1.getApelido());
			jdao.updateJogadorPontos(300, j2.getCodigo());
			jdao.getJogadores().forEach( jog -> {
				System.out.println("apelido: "+ jog.getApelido());
				System.out.println("codigo: "+ jog.getCodigo());
				System.out.println("pontos: "+ jog.getPontos());
				System.out.println("--------------------------");
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
