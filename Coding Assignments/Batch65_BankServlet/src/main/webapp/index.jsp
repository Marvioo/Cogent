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
	<form action="postConsumerData" method="post">
        <table>
  
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
            
			<tr>
                <td>Account Type:</td>
                <td><input type="text" name="type" /></td>
            </tr>
            
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" /></td>
            </tr>
 
        </table>
  
        <input type="submit" value="Submit">
    </form>
    
    <h2>Delete Data</h2>
    <form action="deleteData" method="post">
    	<table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id2" /></td>
            </tr>
 
        </table>
  
        <input type="submit" value="delete">
  
    </form>
    
    <h2>Show table</h2>
    
    <form action="ShowConsumerInfo" method="get">
        <input type="submit" value="Show Table">
    </form>
</body>
</html>