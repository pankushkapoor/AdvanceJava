<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!-- <style>
table,td{
font-size : 20px;
padding : 5px;
border-spacing: 2px;
color : white;
}
input,textarea,select{
font-size : 15px;
opacity : 0.6;
}
input.submit, input.reset,input.resum{
opacity : 1;
}
 
body{
	background-image: "abstract.jpg"
}
</style> -->
</head>
<body >
<div align="center">
<form name="loginFrm" action="LoginServlet" method="post">
<table>
	<tr><td>User name : </td><td><input type="text" required placeholder="Enter Username" name="userName"></td></tr>
	<tr><td>Password : </td><td><input type='password' required name="password" placeholder='Enter Password'></td> </tr>
	<tr><td><input type="submit" value="Login"></td><tr>
</table>
</form>
<div>
	<font color="red">${requestScope.errorMessage}</font>
</div>
</div>
</body>
</html>