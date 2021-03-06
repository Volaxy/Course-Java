package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnection();
		
		String sql = "CREATE TABLE IF NOT EXISTS people ("
				+ "id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,"
				+ "name VARCHAR(100) NOT NULL"
				+ ")";
		
		Statement st = connection.createStatement();
		st.execute(sql);
		
		connection.close();
		
	}

}
