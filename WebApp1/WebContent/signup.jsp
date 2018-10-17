<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up Page</title>
<style>
table, td {
	font-size: 20px;
	padding: 5px;
	border-spacing: 2px;
	color: white;
}

input, textarea, select {
	font-size: 15px;
	opacity: 0.6;
}

body {
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center;
}
</style>
</head>
<body background="abstract.jpg">
	<div align="center">
		<form name="RegisterFrm" action="SignupServlet" method="post">
			<table>
				<tr>
					<td>Associate Id :</td>
					<td><input type="text" required name="associateId"
						placeholder="Enter Associate Id"></td>
				</tr>
				<tr>
					<td>User name :</td>
					<td><input type="text" required name="userName"
						placeholder="Enter Username"></td>
				</tr>
				<tr>
					<td>First Name :</td>
					<td><input type="text" name="firstName" required
						placeholder="Enter First Name"></td>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td><input type="text" name="lastName" required
						placeholder="Enter  Last Name"></td>
				</tr>
				<tr>
					<td>Birth Date:</td>
					<td><input type="date" name="birthDate"></td>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email" required
						placeholder="Enter Email Id"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" required
						placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td>Hobbies:</td>
					<td><input type="checkbox" name="hobbies" value="Dancing">Dancing
						<input type="checkbox" name="hobbies" value="Reading">Reading
						<input type="checkbox" name="hobbies" value="Singing">Signing</td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
					<td><input class="reset" type="reset" value="Reset"></td>
				<tr>
			</table>
		</form>
	</div>
</body>
</html>