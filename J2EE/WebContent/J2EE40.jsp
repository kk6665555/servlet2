<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="BIG5"%><!-- 以% % @為宣告  -->
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	<h1>Big company</h1>
<%
	int a = 10,b=3;
	int lottory=(int)(Math.random()*49 + 1);
	//out.write(lottory);
	
	
	
%>
<%= lottory %><br/>
<%= Calendar.getInstance().get(Calendar.YEAR) %>
	
</body>
</html>