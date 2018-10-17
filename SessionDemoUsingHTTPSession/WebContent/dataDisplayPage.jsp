<%@ page session="false"%>
<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
	<div align="center">
		<%
			HttpSession session = request.getSession(false); 
			UserBean userBean = null;
			if (session == null) 
				response.sendRedirect("personalInfoPage.jsp");
			else
				userBean = (UserBean) session.getAttribute("userBean");
		%>
		<table>
			<tr>
				<td>firstName :-</td>
				<td><%=userBean.getFirstName()%></td>
				<%-- <td>${sessionScope.userBean.firstName}</td> --%>
			</tr>
			<tr>
				<td>lastName :-</td>
				<td><%=userBean.getLastName()%></td>
				<%-- <td>${sessionScope.userBean.lastName}</td> --%>
			</tr>
			<tr>
				<td>bookName :-</td>
				<td><%=userBean.getMovieName()%></td>
				<%-- <td>${sessionScope.userBean.bookName}</td> --%>
			</tr>
			<tr>
				<td>movieName :-</td>
				<td><%=userBean.getMovieName()%></td>
				<%-- <td>${sessionScope.userBean.movieName}</td> --%>
			</tr>
			<tr>
				<td>fruitName :-</td>
				<td><%=userBean.getFruitName()%></td>
				<%-- <td>${sessionScope.userBean.fruitName}</td> --%>
			</tr>
		</table>
	</div>
</body>
</html>