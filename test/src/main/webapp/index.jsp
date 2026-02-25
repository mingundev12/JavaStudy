<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import = "com.plane.test.dto.MenuDTO" %>
<%@	page import = "com.plane.test.dao.MenuDAO" %>
<%@	page import = "java.util.List" %>
<%
    List<MenuDTO> menuList = MenuDAO.getMenuList();
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="icon" href="./resources/img/bunsik.png" type="image/png">
    <style>
    img {
    	width: 300px;
    	height: 300px;
    }
    </style>
</head>
<body>
    <div id="menu">
        <table class="menuTable">
            <caption>메뉴</caption>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>이름</th>
                    <th>사진</th>
                    <th>가격</th>
                    <th>분류</th>
                </tr>
            </thead>
            <tbody>
                <% for(MenuDTO menu : menuList) { %>
                <tr>
                    <td><%=menu.getId()%></td>
                    <td><%=menu.getMenuName()%></td>
                    <td><img src="<%=menu.getMenuImg()%>" alt="<%=menu.getMenuName()%>" srcset=""></td>
                    <td><%=menu.getPrice()%></td>
                    <td><%=menu.getCategory()%></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>