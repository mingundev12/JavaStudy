<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("userId");
	String pw = request.getParameter("userPw");
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>동렬만물상</title>
    <link rel="icon" href="favicon.png" type="image/png">
    <link rel="stylesheet" href="./default.css">
</head>
<body>
	<h3>아이디 : <%=id %></h3>
	<h3>비밀번호 : <%=pw %></h3>
</body>
</html>