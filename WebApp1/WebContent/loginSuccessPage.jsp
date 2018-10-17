<%@page import="com.cg.project.beans.Associate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success Page</title>
</head>
<body>
<%--1st METHOD Standard Scriptlet <%
Associate associate = (Associate) request.getAttribute("associate");
out.print("Welcome " + associate.getUserName());
%> --%>

<%--2nd METHOD Expression normal <%
	Associate associate = (Associate) request.getAttribute("associate");
%>
	Welcome <%=associate.getUserName()%> --%>
	
	<!--3rd METHOD Expression Language -->
	Welcome ${requestScope.associate.userName}
</body>
</html>