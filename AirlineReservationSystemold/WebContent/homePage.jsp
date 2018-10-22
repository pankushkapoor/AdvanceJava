<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String userName = (String)request.getAttribute("userName");%>
Hi <% out.print(userName);%>
<h3>To Search Flights <a href="searchFlightsPage.jsp">click here</a></h3>
<h3>To make a booking <a href="bookingPage.jsp">click here</a></h3>
</body>
</html>