<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<form method="post">
<table>
<tr>
<td>Email</td>
<td><input name="email" type="text"></td>
</tr>
<tr>
<td>Password</td>
<td><input name="pwd" type="password"></td>
</tr>
<tr>
<td colspan="2"><input name="content" type="text"></td>
</tr>
<tr>
<td><input type="submit" />
</td>
<td><input type="reset" />
</td>
</tr>
</table>
</form>


<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
