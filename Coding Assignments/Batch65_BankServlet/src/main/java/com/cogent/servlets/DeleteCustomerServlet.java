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

@WebServlet("/deleteData")
public class DeleteCustomerServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Get the values from the request using 'getParameter'
        String id = request.getParameter("id2");
        
        try{
        	PrintWriter out = response.getWriter();
            BankBusinessLogic.deletConsumer(Integer.parseInt(id));
            out.print("deleted");
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
}
