<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:directive.page import="tw.mike.beans.Member"/>
    <%
	Member member = new Member();
    member.setId("002"); member.setName("666");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:declaration>
int i; String name;
</jsp:declaration>
<jsp:scriptlet>
i=2;
name="kk";
</jsp:scriptlet>
<jsp:expression>member</jsp:expression>
<jsp:text>12345678</jsp:text>



</body>
</html>