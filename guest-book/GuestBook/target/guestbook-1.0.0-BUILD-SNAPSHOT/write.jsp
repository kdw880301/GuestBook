<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function validateForm() {

	  if(!validateEmail(document.getElementById("email").value))
	  {
	     alert('이메일을 확인하세요.');
	     document.getElementById("email").focus();
	     return false;
	  } else if(document.getElementById("pwd").value == "") {
	      alert('암호를 입력해주세요.');
	     document.getElementById("pwd").focus();
	     return false;
	  } else if(document.getElementById("content").value == "") {
		  alert('내용을 입력해주세요.');
	     document.getElementById("content").focus();
	     return false;
	  }
	  return true;
	}
	
	function validateEmail(email)
	 {
	  var reg_email = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;

	  if(!reg_email.test(email))
	  {
	   return false;
	  }
	  return true;
	 }
</script>
</head>
<body>
<form method="post" action="process" onsubmit="return validateForm();">
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
</body>
</html>