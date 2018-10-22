<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
	<form name="regfrm" method="post" action='SignUp'>
		<h1 style="color: red">SignUp Page</h1>
		<b>User Name : </b> <input type='text' name='userName' required placeholder='Enter your User Name'><br><br>
		<b>Password : </b><input type="password" name='password' required placeholder='Enter your password'><br><br>
		<b>Mobile Number : </b> <input type='text' name='mobileNo' required placeholder='Enter your Mobile Number'><br><br>
		<b>Role : </b><select name='role'>
			<option value='Customer'>Customer</option>
			<option value='Airline-Executive'>Airline-Executive</option>
			<option value='Admin'>Admin</option>
		</select><br><br>
		<input type="submit" value="Submit">
		<input type="reset" value="Reset"><br>
	</form>
</body>
</html>