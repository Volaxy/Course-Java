package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.ConnectionFactory;

public class DAO {
	private Connection connection;
	
	public int include(String sql, Object... actributes) throws IOException {
		try {
			PreparedStatement st = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			addActributes(st, actributes);
			
			if(st.executeUpdate() > 0) {
				ResultSet result = st.getGeneratedKeys();
				
				if(result.next()) {
					return result.getInt(1);
				}
			}
			
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void addActributes(PreparedStatement st, Object[] actributes) throws SQLException {
		int index = 1;
		for (Object object : actributes) {
			if(object instanceof String) {
				st.setString(index, (String) object);
			} else {
				if(object instanceof Integer) {
					st.setInt(index, (Integer) object);
				}
			}
			
			index++;
		}
	}
	
	private Connection getConnection() throws IOException {
		try {
			if(connection != null && !connection.isClosed()) {
				return connection;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		connection = ConnectionFactory.getConnection();
		
		return connection;
	}
}
