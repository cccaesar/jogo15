package conexaoBanco;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import negocio.Jogador;
import negocio.Partida;
import negocio.Peca;
import negocio.Tabuleiro;

public class PartidaDAO {
	private ConexaoSQL conn;
	
	public PartidaDAO() {
    	conn = new ConexaoSQL();
    }
	
    public void dropPartidaTable() throws Exception {
    	Statement stmt = conn.getConexao().createStatement();
    	stmt.executeUpdate("drop table Partida;");
    }
	
    public void createPartidaTable() throws Exception {
    	Statement stmt = conn.getConexao().createStatement();
    	stmt.executeUpdate("create table if not exists Partida ( "+
    					   "cod_partida INTEGER primary key," +
    					   "posicoes varchar(45) required not null,"+
    					   "imagem integer,"+
    					   "vez integer required not null," +
    					   "finalizada integer);");
    }
    
    public Partida getPartidaAtiva(int codigo) throws Exception {
    	Statement stmt = conn.getConexao().createStatement();
    	ResultSet rs = stmt.executeQuery("select * from partida as p where cod_partida="+codigo+" and finalizada=0;");
		Partida partida = null;
		while(rs.next()) {
			String posicoes[] = rs.getString("posicoes").split("/");
			List<Peca> pecas = new ArrayList<Peca>();
			for(int i = 0; i < posicoes.length; i++) {
				pecas.add(new Peca(Integer.valueOf(posicoes[i]), "", i, Integer.valueOf(posicoes[i]) == 16));
			}
			Tabuleiro tabuleiro = new Tabuleiro(pecas, true);
			partida = new Partida(tabuleiro, rs.getInt("vez"));
		}
		ResultSet rs2 = stmt.executeQuery("select * from partida as p where cod_partida="+codigo+" and finalizada=0"+
										  "inner join Jogador as j"+
										  "on j.cod_partida="+codigo+";");
		while(rs2.next()) {
			partida.addJogador(new Jogador(rs2.getString("apelido"), rs2.getInt("codigo"), rs2.getFloat("pontos")));
		}
		return partida;
    }
    
    public void salvarPartida(Partida partida) throws Exception {
    	int finalizada = partida.getVez() < partida.getJogadores().size() - 1 ? 0 : 1;
    	String posicoes = "";
    	partida.getTabuleiro()
		.getPecas()
		.stream()
		.sorted((peca1, peca2) -> Integer.compare(peca1.getPosicao(), peca2.getPosicao()))
		.forEach(peca -> {
			if(posicoes.length() > 0) {
				posicoes.concat("/");
			}
			posicoes.concat(String.valueOf(peca.getId()));
		});
    	
		Statement stmt = conn.getConexao().createStatement();
		String updateQuery = "Insert into PARTIDA(cod_partida, posicoes, imagem, vez, finalizada) values("+1+",'"+posicoes+"',"+1+","+partida.getVez()+","+finalizada+");";
		stmt.executeUpdate(updateQuery);
    }
}
