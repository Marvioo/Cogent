package com.cogent.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {
	static Connection conn;
	public static void addEmp(int id, String name, String company) throws SQLException {
		conn = ConnectToDB.connectionSetup();
	   	PreparedStatement stmt = conn.prepareStatement("insert into employee values(?, ?, ?)");
	   	stmt.setInt(1,id);
	   	stmt.setString(2, name);
	   	stmt.setString(3, company);
	    int i = stmt.executeUpdate();
	 	System.out.println(i+" records inserted");
		
	}
	
	public static void readEmp() throws SQLException {
		conn = ConnectToDB.connectionSetup();
	    Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * From employee");
        while(rs.next()){
        //Display values
	        System.out.print("ID: " + rs.getInt("EmployeeID"));
	        System.out.print(", Name: " + rs.getString("Name"));
	        System.out.println(", Name: " + rs.getString("company"));
        }
	}
	
	public static void updateEmp(int id, String company) throws SQLException {
		conn = ConnectToDB.connectionSetup();
	   	PreparedStatement stmt2 = conn.prepareStatement("UPDATE employee SET company = ? WHERE EmployeeID = ?");
	   	stmt2.setString(1, company);
	   	stmt2.setInt(2, id);
	   	int j = stmt2.executeUpdate();
	   	System.out.println(j+" records updated");
	}
	
	public static void deletEmp(int id) throws SQLException {
		conn = ConnectToDB.connectionSetup();
	   	PreparedStatement stmt = conn.prepareStatement("DELETE FROM employee WHERE EmployeeID = ?");
	   	stmt.setInt(1, id);
	    int i = stmt.executeUpdate();
	 	System.out.println(i+" records deleted");
	}
}
