package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Person;

public class Program {

	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		
		String sql = "SELECT * FROM people";
		
		Statement st = connection.createStatement();		
		ResultSet result = st.executeQuery(sql);
		
		List<Person> persons = new ArrayList<Person>();
		
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			
			persons.add(new Person(id, name));
		}
		
		for (Person person : persons) {
			System.out.println(person.getId() + " -> " + person.getName());
		}
		
		st.close();
		connection.close();
	}

}
