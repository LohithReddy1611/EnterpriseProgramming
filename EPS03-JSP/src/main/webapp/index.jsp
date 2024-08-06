<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
</head>
<body>
    <%! int cube(int n){
    return n*n*n;
    }%>
<%= "cube of given no: " +cube(3) %>
<%out.print(cube(5)); %>
</body>
</html>
