package br.vitor.jdbc;

import java.sql.*;

public class ConnectionManager {
	
	private static ConnectionManager instance;
	private ConnectionManager() {}
	
	public static ConnectionManager getInstance() {
		if(instance == null) 
			instance = new ConnectionManager();
			return instance;
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost/fiap";
		String userName ="vaos";
		String pass = "vaos1994";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, pass);			
		
		return con;
	}
}
