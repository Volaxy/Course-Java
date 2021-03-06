package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "KOKAkola662@";
		
		Connection conection = DriverManager.getConnection(url, user, password);
		
		System.out.println("Conection Successful");
		
		conection.close();
	}

}
