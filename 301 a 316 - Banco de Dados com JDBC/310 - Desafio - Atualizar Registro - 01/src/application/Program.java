package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection connection = ConnectionFactory.getConnection();
		
		System.out.print("Write the id for modify: ");
		int id = sc.nextInt();

		String sql = "SELECT * FROM people WHERE id = ?"; 
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet result = ps.executeQuery();

		if(result.next()) {
			sc.nextLine();
			System.out.print("Enter the new name: ");
			String name = sc.nextLine();
			
			sql = "UPDATE people SET name = ? WHERE id = ?";
			ps.close();
			
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			
			ps.execute();
		}
		
		sc.close();
		connection.close();
		ps.close();
	}

}
