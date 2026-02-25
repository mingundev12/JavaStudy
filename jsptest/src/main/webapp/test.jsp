<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- jsp 주석 --%>

<% // 스크립트릿 %>
<%="이순신" %> <%-- 표현식 --%>
<%! // 선언부 %>


<%! int num = 10; %>
<%
	if (num > 5) {
		out.write("5보다 크다");
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>나는 동적 페이지 입니다.</h1>
	
	<form method="get" action="test_result.jsp">
		이름 <input type="text" name="myName"> <br>
		나이 <input type="number" name="age"> <br>
		직업 <input type="text" name="job"> <br>
		<button> 등록 </button>
	</form>
	
	<a href="./responseTest.jsp">페이지이동</a>
</body>
</html>