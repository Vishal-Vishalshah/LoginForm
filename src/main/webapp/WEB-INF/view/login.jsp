<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

<h2>Login page</h2>

<font color="red">${ErrorMessage}</font>
<form action="login" method="post">
<input type="text" name="t1">
<input type="password" name="t2">
<input type="submit" value="login" >

</form>


</body>
</html>