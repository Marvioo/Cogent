package com.cogent.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankBusinessLogic {
	static Connection conn;
	
	public static void addConsumer(int id, String name, String type, String address) throws SQLException{
		conn = ConnectToBankDB.connectionSetup();
		PreparedStatement stmt = conn.prepareStatement("insert into consumers values(?, ?, ?, ?)");
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setString(3, type);
		stmt.setString(4, address);
		
	    int i = stmt.executeUpdate();
	 	System.out.println(i+" records inserted");
	}
	
	public static String readConsumers() throws SQLException {
		conn = ConnectToBankDB.connectionSetup();
	    Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * From consumers");
	    StringBuilder sb = new StringBuilder();
	    
        while(rs.next()){
        //Display values
        	sb.append(rs.getInt("ConsumerId") + "&" + rs.getString("Name") + "&" + rs.getString("AccountType") + "&" + rs.getString("Address")+"@");
        }
        System.out.println(sb.toString());
        return sb.toString();
	}
	
	public static void deletConsumer(int id) throws SQLException {
		conn = ConnectToBankDB.connectionSetup();
	   	PreparedStatement stmt = conn.prepareStatement("DELETE FROM consumers WHERE ConsumerId = ?");
	   	stmt.setInt(1, id);
	    int i = stmt.executeUpdate();
	 	System.out.println(i+" records deleted");
	}
}
