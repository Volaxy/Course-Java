package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	public static Connection getConnection() throws IOException {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("url");
			final String user = prop.getProperty("user");
			final String password = prop.getProperty("password");

			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties src = new Properties();
		
		String url = "../connection.properties";
		
		src.load(ConnectionFactory.class.getResourceAsStream(url));
		
		return src;	
	}
	
}
