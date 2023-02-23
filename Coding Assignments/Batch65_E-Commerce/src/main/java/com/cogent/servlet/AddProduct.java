package com.cogent.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cogent.database.Service;

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Get the values from the request using 'getParameter'
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int cost = Integer.parseInt(request.getParameter("cost"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        int available =  Integer.parseInt(request.getParameter("available"));
        int sold = Integer.parseInt(request.getParameter("sold"));
        
        try{
        	PrintWriter out = response.getWriter();
            Service.addProduct(id, name, available, cost, sold, discount);
            out.print("added");
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
}
