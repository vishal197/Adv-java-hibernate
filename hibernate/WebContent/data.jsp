<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/controller_search">
<input type="submit">
</form>
</body>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="1px solid black">
<tr><th>ID</th><th>FNAME</th><th>LNAME</th><th>UNAME</th><th>Paswword</th><th colspan="2">Action</th></tr>
<c:forEach items="${sessionScope.list}" var="z">
<tr><td>${z.id}</td>
<td>${z.fn}</td>
<td>${z.ln}</td>
<td>${z.un}</td>
<td>${z.pw}</td>
<td><a href="<%=request.getContextPath()%>/update?id=${z.id}">UPDATE</a></td>
<td><a href="<%=request.getContextPath()%>/delete?id=${z.id}">DELETE</a></td>
</tr>
</c:forEach>
</table>
<c:remove var="list" scope="session"/>
</html>