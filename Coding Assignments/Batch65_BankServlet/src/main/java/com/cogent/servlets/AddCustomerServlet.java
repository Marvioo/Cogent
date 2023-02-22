package com.cogent.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cogent.database.BankBusinessLogic;


@WebServlet("/postConsumerData")
public class AddCustomerServlet extends HttpServlet  {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Get the values from the request using 'getParameter'
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String company = request.getParameter("type");
        String address = request.getParameter("address");
        
        
        try{
        	PrintWriter out = response.getWriter();
            BankBusinessLogic.addConsumer(Integer.parseInt(id), name, company, address);
            out.print("added");
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
}
