<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.mike.j2ee.J2EEUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//Scop
	//1. Page
	pageContext.setAttribute("name", "page");//pageContext 僅限目前的頁面
	pageContext.setAttribute("name1", "<h1>Big</h1>");
	//2. Reques
	request.setAttribute("name", "request");
	//3. session
	session.setAttribute("name", "session");
	//4.applaction
	application.setAttribute("name", "application");
	





%>

Page: ${pageScope.name } <br/>
Page1: ${pageScope.name1 } <br/>
request: ${requestScope.name } <br/>
session: ${sessionScope.name } <br/>
application: ${applicationScope.name } <br/>
1.m1(): <%=J2EEUtil.m1("mike") %><br/>
2.m1():${J2EEUtil.m1(param.name)}

</body>
</html>