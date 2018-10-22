<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BookingServlet" method="post">
	<b>Customer Email : </b><input type="text" name="custEmail"><br>
	<b>No. of Passengers : </b><input type="number" name="noOfPassengers"><br>
	<b>Class Type : </b><select>
		<option>First Class</option>
		<option>Business Class</option>
	</select><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>