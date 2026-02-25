<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("userId");
	String pw = request.getParameter("userPw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	String[] interests = request.getParameterValues("interest");
	
	for(String i : interests) {
		out.println(i + "<br>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>