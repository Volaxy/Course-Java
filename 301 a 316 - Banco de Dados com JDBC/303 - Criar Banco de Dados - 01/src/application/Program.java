package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "KOKAkola662@";
		
		Connection connection = DriverManager.getConnection(url, user, password);

		Statement st = connection.createStatement();
		
		st.execute("CREATE DATABASE IF NOT EXISTS bancojdbc");
		
		connection.close();
		
	}

}
