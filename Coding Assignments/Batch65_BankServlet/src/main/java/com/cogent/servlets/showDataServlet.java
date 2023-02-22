package com.cogent.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cogent.database.BankBusinessLogic;


@WebServlet("/ShowConsumerInfo")
public class showDataServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
    	
//    	BusinessLogic bl = new BusinessLogic();
    	PrintWriter writer = response.getWriter();
    	String dbInfo = "nothing yet";
    	try{
    		
    		dbInfo = BankBusinessLogic.readConsumers();
    		
    		String[] rows = dbInfo.split("@");
        	writer.print("<html>");
        	writer.print("<head></head>");
        	writer.print("<body>");
        	writer.print("<table>");
        	
        	//headers
        	writer.print("<tr>");
        	writer.print("<th>ConsumerId</th>");
        	writer.print("<th>Name</th>");
        	writer.print("<th>Account Type</th>");
        	writer.print("<th>Address</th>");
        	writer.print("</tr>");
        	
        	// content
        	for(String row: rows) {
        		String[] elements = row.split("&");
        		writer.print("<tr>");
        		for(String element: elements) {
        			writer.print("<td>"+element+"</td>");
        		}
        		writer.print("</tr>");
        	}
        	
        	writer.print("</table>");
        	writer.print("</body>");
        	writer.print("</html>");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
        
    }
    
    
}
