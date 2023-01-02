package conexaoBanco;

import negocio.Jogador;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JogadorDAO jdao = new JogadorDAO();
		Jogador j1,j2;
		try {
			jdao.createJogadorTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			jdao.insertJogador(new Jogador( "Teste I",  10));
			jdao.insertJogador(new Jogador( "Teste II",  11));
			jdao.insertJogador(new Jogador( "Teste III",  12));
			jdao.insertJogador(new Jogador( "Jota Camelo",  1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			j1 = jdao.getJogador("Teste I");
			j2 = jdao.getJogador(11);
			jdao.updateJogadorPontos(25, j1.getApelido());
			jdao.updateJogadorPontos(312, j2.getCodigo());
			jdao.getJogadores().forEach( jog -> {
				System.out.println("apelido: "+ jog.getApelido());
				System.out.println("codigo: "+ jog.getCodigo());
				System.out.println("pontos: "+ jog.getPontos());
				System.out.println("--------------------------");
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			jdao.limparHistorico();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			jdao.getJogadores().forEach( jog -> {
				System.out.println("apelido: "+ jog.getApelido());
				System.out.println("codigo: "+ jog.getCodigo());
				System.out.println("pontos: "+ jog.getPontos());
				System.out.println("--------------------------");
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
