<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome to my world</h1>
		<form action="displayAll">
		<input type="text" name="designation"/>
				<input type="submit" value="display all the employees"/>
		</form>
		<form action="displayByDesignation">
				<input type="text" name="designation"/>
				<input type="submit" value="display all the employees"/>
		</form>
		<hr>
		<form action="insertData">
			id: <input type ="text" name="eid"/><br>
			name : <input type ="text" name="name"/><br>
			age : <input type ="text" name="age"/><br>
			designation: <input type ="text" name="designation"/><br>
			<input type ="submit" value="insert the records"/><br>
		</form>
		<hr>
		<form action="collect">
			id: <input type ="number" name="eid"/><br>
			Manager: <input type ="text" name="manager"/><br>
			<input type ="submit" value="display"/><br>
		</form>
</body>
</html>