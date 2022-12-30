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
    
    public void createJogadorTable() throws Exception {
    	Statement stmt = conn.getConexao().createStatement();
    	stmt.executeUpdate("create table if not exists Jogador ( "+
    					   "codigo INTEGER primary key," +
    					   "apelido VARCHAR(40) unique not null," +
    					   "pontos float);");
    }
	
	public List<Jogador> getJogadores() throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogador");
		List<Jogador> jogadores = new ArrayList<Jogador>();
		while(rs.next()) {
			Jogador jogador = new Jogador(rs.getString("apelido"), rs.getInt("codigo"), rs.getFloat("pontos"));
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
			jogador = new Jogador(rs.getString("apelido"), rs.getInt("codigo"), rs.getFloat("pontos"));
		}
		return jogador;
	}
	
	public Jogador getJogador(int codigo) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogador where codigo="+codigo+";");
		System.out.println("Select * from Jogador where codigo="+codigo+";");
		Jogador jogador = null;
		while(rs.next()) {
			jogador = new Jogador(rs.getString("apelido"), rs.getInt("codigo"), rs.getFloat("pontos"));
		}
		return jogador;
	}
	
	public void insertJogador(Jogador jogador) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		String updateQuery = jogador.getPontos() == -1 ? "Insert into JOGADOR(codigo, apelido) values("+jogador.getCodigo()+",'"+jogador.getApelido()+"');" : 
			"Insert into JOGADOR(codigo, apelido, pontos) values("+jogador.getCodigo()  +",'"+jogador.getApelido()+"',"+jogador.getPontos()+");";
		System.out.println(updateQuery);
		stmt.executeUpdate(updateQuery);
	}
	
	public void limparHistorico() throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("drop table if exists JOGADOR");
	}
	
	public void updateJogadorPontos(float pontos, int codigo) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("update JOGADOR "
				+"set pontos="+pontos
				+" where codigo="+codigo);
	}
	
	public void updateJogadorPontos(float pontos, String apelido) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("update JOGADOR "
				+"set pontos="+pontos
				+" where apelido='"+apelido+"'");
	}
	
}
