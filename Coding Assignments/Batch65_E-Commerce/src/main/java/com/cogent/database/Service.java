package com.cogent.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.cogent.entity.Product;


public class Service {
	static Connection conn;
	public static void addProduct(int id, String name, int available, int cost, int sold, int discount) throws SQLException {
		conn = ConnectToDB.connectionSetup();
	   	PreparedStatement stmt = conn.prepareStatement("insert into Products values(?, ?, ?, ?, ?, ?)");
	   	stmt.setInt(1,id);
	   	stmt.setString(2, name);
	   	stmt.setInt(3,cost);
	   	stmt.setInt(4,discount);
	   	stmt.setInt(5,available);
	   	stmt.setInt(6,sold);
	   	
	    int i = stmt.executeUpdate();
	 	System.out.println(i+" records inserted");
		
	}
	
	public static Stream<Product> readProducts() throws SQLException {
		conn = ConnectToDB.connectionSetup();
	    Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * From Products");
	    List<Product> list = new ArrayList<>();
        while(rs.next()){
        //Display values
        	int discount = rs.getInt("Discount");
        	int sold = rs.getInt("Sold");
        	
        	if(sold <= 10) {
        		discount = discount - 10;
        	}
        	list.add(new Product(rs.getInt("ProductId"), rs.getString("Name"), rs.getInt("Available"), rs.getInt("Cost"), sold, discount));
        }
        return list.stream();
	}
}
