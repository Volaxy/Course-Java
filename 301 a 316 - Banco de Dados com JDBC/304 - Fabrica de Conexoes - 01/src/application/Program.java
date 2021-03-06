package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnection();

		Statement st = connection.createStatement();
		
		st.execute("CREATE DATABASE IF NOT EXISTS bancojdbc");
		
		connection.close();
		
	}

}
