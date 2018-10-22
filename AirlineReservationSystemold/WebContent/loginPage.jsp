<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<form name='loginFrm' action="Login" method="post">
<h1 style="color: red">Login Page</h1>
<b>UserName : </b>
		<input type='text'  name='userName' required placeholder='Enter your First Name'><br>
		<br>
		<b>Password :	</b>	
		<input type="password" name='password' required placeholder='Enter your Last Name'><br><br>
		<b>Role : </b>
		<select name='role'>
			<option value='Customer'>Customer</option>
			<option value='Airline-Executive'>Airline-Executive</option>
			<option value='Admin'>Admin</option>
		</select><br><br>
		<input type="submit" value="Submit">
</form>
</body>
</html>