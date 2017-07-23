<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Integer x = (Integer)application.getAttribute("x");
		//從application取出資料其,傳回值就是取回的資料,不過傳回值是物件型態(Object)需要轉換成正確的物件
		//型態才可使用
		out.println(x);
		x++;
		application.setAttribute("x",x);
		//將資料存入application 
	
	
	%>
</body>
</html>