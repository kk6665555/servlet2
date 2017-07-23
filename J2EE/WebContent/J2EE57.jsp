<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="tw.mike.beans.*" %>
<%
	Member member = new Member("002","MIKE");
	application.setAttribute("member", member);
	member.setId("001");member.setName("brad");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome,<%=member %>
<%
member.m1();
%>
</body>
</html>