package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		Connection connection = ConnectionFactory.getConnection();
		
		System.out.println("Write the name you want you find");
		String search = sc.next();
		
		String sql = "SELECT * FROM people WHERE name LIKE ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, "%" + search + "%");
		
		ResultSet result = ps.executeQuery();
		
		List<Person> persons = new ArrayList<Person>();
		
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			
			persons.add(new Person(id, name));
		}
		
		for (Person person : persons) {
			System.out.println(person.getId() + " -> " + person.getName());
		}
		
		connection.close();
		ps.close();
		sc.close();
	}

}
