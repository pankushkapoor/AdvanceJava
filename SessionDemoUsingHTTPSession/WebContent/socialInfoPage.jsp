<%@ page session="false"%>
<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
	<div>
		<%
			HttpSession session = request.getSession(false); //if there's already a session id, then okay. If there isnt, then don't create.
			UserBean userBean = null;
			if(session == null) //chrome gmail logged in link copying to firefox example
				response.sendRedirect("personalInfoPage.jsp");
			else
				userBean = (UserBean)session.getAttribute("userBean");
		%>
		<font size=10>Welcome <%=userBean.getFirstName() %></font>
		<%-- <font size=10>Welcome ${sessionScope.userBean.firstName}</font> --%>
		<form name="socialInfoFrm" action="SocialInfoServlet" method="post">
			<table>
				<tr>
					<td>Enter fruitName</td>
					<td><input type="text" name="fruitName"/></td>
				</tr>
				<tr>
					<td>Enter movieName</td>
					<td><input type="text" name="movieName"/></td>
				</tr>
				<tr>
					<td>Enter bookName</td>
					<td><input type="text" name="bookName"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>