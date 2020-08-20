<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>

<h1>Insert User Page</h1>
	<form action="../AddUser" method="get">
		User name : <input type="text" name="username">
		User Type :
			<select name="user-type">
				<option value="admin">admin</option>
					<option value="acadmic">academic</option>
						<option value="student">student</option>
			</select>
			Use Passwprd: <input type="password" name="password">	
				<button type="submit" name="adduser">submit</button>

</body>

</html>