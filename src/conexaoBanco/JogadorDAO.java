package conexaoBanco;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import negocio.Jogador;


public class JogadorDAO {
	
	private ConexaoSQL conn;
	
	public List<Jogador> getJogadores() throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogadores");
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
		ResultSet rs = stmt.executeQuery("Select * from Jogadores where apelido='"+apelido+"'");
		Jogador jogador = null;
		while(rs.next()) {
			jogador = new Jogador(rs.getString("apelido"), rs.getInt("codigo"), rs.getFloat("pontos"));
		}
		return jogador;
	}
	
	public Jogador getJogador(int codigo) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Jogadores where codigo="+codigo);
		Jogador jogador = null;
		while(rs.next()) {
			jogador = new Jogador(rs.getString("apelido"), rs.getInt("codigo"), rs.getFloat("pontos"));
		}
		return jogador;
	}
	
	public void insertJogador(Jogador jogador) throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("Insert into JOGADOR(apelido, pontos) values("+jogador.getApelido()+","+jogador.getPontos()+")");
	}
	
	public void limparHistorico() throws Exception {
		Statement stmt = conn.getConexao().createStatement();
		stmt.executeUpdate("drop table if exists JOGADOR");
	}
	
}
