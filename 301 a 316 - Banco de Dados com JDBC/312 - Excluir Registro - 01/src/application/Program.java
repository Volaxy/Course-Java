package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Report the code: ");
		int id = sc.nextInt();

		Connection connection = ConnectionFactory.getConnection();
		String sql = "DELETE FROM people WHERE id = ?";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, id);

		int c = stmt.executeUpdate();

		if (c > 0) {
			System.out.println("Person delete with successful!");
		} else {
			System.out.println("Nothing done!");
		}

		System.out.println("Rows affected: " + c);

		connection.close();
		sc.close();
	}

}
