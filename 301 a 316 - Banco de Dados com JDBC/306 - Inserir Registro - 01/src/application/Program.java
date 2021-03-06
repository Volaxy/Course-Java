package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection connection = ConnectionFactory.getConnection();
		
		String name = sc.next();
		String sql = "INSERT INTO people (name) VALUES (?)";
		
		PreparedStatement st = connection.prepareStatement(sql);
		st.setString(1, name);
		
		st.execute();
		
		connection.close();
		sc.close();
	}

}
