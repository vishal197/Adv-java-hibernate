<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/RegController" method="get">
Firstname:<input type="text" name="fn"><br><br>
Lastname:<input type="text" name="ln"><br><br>
Username:<input type="text" name="un"><br><br>
Password:<input type="password" name="pw"><br><br>
<input type="submit">
</form>
</body>
</html>