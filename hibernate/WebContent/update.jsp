<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<c:forEach items="${sessionScope.list}" var="z">
<form action="<%=request.getContextPath()%>/edit">
<input type="hidden" value="${z.id}" name="id">
Firstname:<input type="text" name="fn" value="${z.fn}"><br><br>
Lastname:<input type="text" name="fn" value="${z.ln}"><br><br>
<input type="submit">
</form>
</c:forEach>
</body>
</html>