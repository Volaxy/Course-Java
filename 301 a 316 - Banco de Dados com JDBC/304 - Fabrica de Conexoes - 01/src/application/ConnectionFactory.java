package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "KOKAkola662@";
		
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
