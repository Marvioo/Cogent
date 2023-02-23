<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Insert Data</h2>
	<form action="addProduct" method="post">
        <table>
  
            <tr>
                <td> Product Id:</td>
                <td><input type="text" name="id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
            
			<tr>
                <td>Cost:</td>
                <td><input type="text" name="cost" /></td>
            </tr>
            
            <tr>
                <td>Discount:</td>
                <td><input type="text" name="discount" /></td>
            </tr>
            
             <tr>
                <td>Available:</td>
                <td><input type="text" name="available" /></td>
            </tr>
            
             <tr>
                <td>Sold:</td>
                <td><input type="text" name="sold" /></td>
            </tr>
 
        </table>
  
        <input type="submit" value="Submit">
    </form>
    
    <h2>Show table</h2>
    
    <form action="showProducts" method="get">
        <input type="submit" value="Show Table">
    </form>
</body>
</html>