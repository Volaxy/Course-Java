package application;

import java.io.IOException;

import dao.DAO;

public class Program {

	public static void main(String[] args) throws IOException {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO people (name) VALUES (?)";
		dao.include(sql, "Joao");
		dao.include(sql, "Ana");
		dao.include(sql, "Julia");
	}

}
