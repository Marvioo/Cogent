package com.cogent.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	static final String DB_URL = "jdbc:mysql://localhost/batch65";
	static final String USER = "root";
	static final String PASS = "zgj600690";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static Connection conn;
	public static Connection connectionSetup() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
