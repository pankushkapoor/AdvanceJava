<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<form action="SearchServlet" method="post">
	<b>Departure City : </b><input type="text" name="depCity"><br>
	<b>Arrival City : </b><input type="text" name="arrCity"><br>
	<!-- <b>Date of Journey : </b><input type="date" name="dateOfJourney"><br> -->
	<input type="submit" value="Search Flights">
</form>
</body>
</html>