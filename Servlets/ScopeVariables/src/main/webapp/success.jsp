<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to JSP</h1>

<BR>

<%

 // String name = (String)    request.getAttribute("username");

//String name = (String)    session.getAttribute("username");

String name = (String)    application.getAttribute("username");



		out.print("welcome to jsp page "+name);
%>


</body>
</html>