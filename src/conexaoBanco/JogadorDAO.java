package conexaoBanco;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import negocio.Jogador;


public class JogadorDAO {
	
	private ConexaoSQL conn;
	
    public JogadorDAO() {
    	conn = new ConexaoSQL();
    }
    
    public void dropJogadorTable() throws Exception {
    	Statement stmt = conn.getConexao().createStatement();
    	stmt.executeUpdate("drop table Jogador;");
    }
    
    public void createJogadorTable() throws Exception {
    	Statement stmt = conn.getConexao().createStatement();
    	stmt.executeUpdate("create table if not exists Jogador ( "+
    					   "cod_jogador AUTO_INCREMENT primary key," +
    					   "apelido VARCHAR(40) unique not null," +
    					   "pontos float,"+
    					   "cod_partida integer, foreign key(cod_partida) references Partida(cod_partida));");
    }
	
	public List<Jogador> getJogadores() throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogador");
		List<Jogador> jogadores = new ArrayList<Jogador>();
		while(rs.next()) {
			Jogador jogador = new Jogador(rs.getString("apelido"), rs.getInt("cod_jogador"), rs.getFloat("pontos"));
			jogadores.add(jogador);
		}
		if(jogadores.size() == 0) {
			return null;
		}
		return jogadores;
	}
	
	public Jogador getJogador(String apelido) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogador where apelido='"+apelido+"'");
		Jogador jogador = null;
		while(rs.next()) {
			jogador = new Jogador(rs.getString("apelido"), rs.getInt("cod_jogador"), rs.getFloat("pontos"));
		}
		return jogador;
	}
	
	public Jogador getJogador(int codigo) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogador where cod_jogador="+codigo+";");
		Jogador jogador = null;
		while(rs.next()) {
			jogador = new Jogador(rs.getString("apelido"), rs.getInt("cod_jogador"), rs.getFloat("pontos"));
		}
		return jogador;
	}
	
	public void insertJogador(Jogador jogador) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		String updateQuery = jogador.getPontos() == -1 ? "Insert into JOGADOR(apelido) values('"+jogador.getApelido()+"');" : 
			"Insert into JOGADOR(apelido, pontos) values('"+jogador.getApelido()+"',"+jogador.getPontos()+");";
		stmt.executeUpdate(updateQuery);
	}
	
	public void limparHistorico() throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("delete from jogador");
	}
	
	public void updateJogadorPontos(float pontos, int codigo) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("update JOGADOR "
				+"set pontos="+pontos
				+" where cod_jogador="+codigo);
	}
	
	public void updateJogadorPontos(float pontos, String apelido) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("update JOGADOR "
				+"set pontos="+pontos
				+" where apelido='"+apelido+"'");
	}
	
}
