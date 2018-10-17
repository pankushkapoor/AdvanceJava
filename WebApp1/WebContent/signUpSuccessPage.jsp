<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.cg.project.beans.Associate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Success</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<td>Associate</td>
				<td>${requestScope.associate.associateId}</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>${requestScope.associate.firstName}</td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td><c:forEach var="hobbies" items="${requestScope.associate.hobbies}">
					<%-- <x:out select="$hobbies"/> --%>
					${hobbies}
					</c:forEach></td>
			</tr>
		</table>
	</div>


	<%-- <% 
Associate associate = (Associate) request.getAttribute("associate");
out.print("Welcome " + associate.getFirstName() + " " + associate.getLastName());
%> --%>
</body>
</html>