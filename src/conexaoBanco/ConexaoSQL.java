package conexaoBanco;

import java.sql.Connection;
import java.sql.SQLException;
import org.sqlite.SQLiteDataSource;

public class ConexaoSQL {
	private Connection conn;
	private String url="jdbc:sqlite:ranking15.db";
	private SQLiteDataSource ds;
	
	public void createDatabase() {
		ds = new SQLiteDataSource();
		ds.setUrl(url);
	}
	
	public Connection getConexao() throws SQLException{
		this.conn = this.ds.getConnection();
		return conn;
	}
}
