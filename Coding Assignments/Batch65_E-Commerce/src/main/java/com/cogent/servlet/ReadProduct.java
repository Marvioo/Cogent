package com.cogent.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cogent.database.Service;
import com.cogent.entity.Product;



@WebServlet("/showProducts")
public class ReadProduct extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
    	
//    	BusinessLogic bl = new BusinessLogic();
    	PrintWriter writer = response.getWriter();
    	Stream<Product> dbInfo;
    	try{
    		
    		dbInfo = Service.readProducts();
    		
        	writer.print("<html>");
        	writer.print("<head></head>");
        	writer.print("<body>");
        	writer.print("<table>");
        	
        	//headers
        	writer.print("<tr>");
        	writer.print("<th>Product ID</th>");
        	writer.print("<th>Name</th>");
        	writer.print("<th>Available</th>");
        	writer.print("<th>Cost</th>");
        	writer.print("<th>Sold</th>");
        	writer.print("<th>Discount</th>");
        	writer.print("</tr>");
        	
        	// content
        	dbInfo.forEach(x -> {
        		writer.print("<tr>");
        		writer.print("<td>" + x.getId() + "</td>");
        		writer.print("<td>" + x.getName() + "</td>");
        		writer.print("<td>" + x.getCost() + "</td>");
        		writer.print("<td>" + x.getDiscount() + "</td>");
        		writer.print("<td>" + x.getAvailable() + "</td>");
        		writer.print("<td>" + x.getSold() + "</td>");
        		writer.print("</tr>");
        	});
        	
        	
        	writer.print("</table>");
        	writer.print("</body>");
        	writer.print("</html>");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
}
