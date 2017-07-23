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
	application.setAttribute("x", 123);
	request.setAttribute("x",(int)(Math.random()*49+1));
	
	session.setAttribute("x", 66775);
	
	
	
	String x = request.getParameter("x");
	Integer intx = (int)request.getAttribute("x");
	Integer testx = (Integer)application.getAttribute("x");
	Integer testx1=(Integer)session.getAttribute("x");
	
	out.println(x+"<br>");
	out.println(testx+"<br>");
	out.println(testx1+"<br>");
	out.println(intx);
%>
<hr>
<a href="J2EE54.jsp">Goto J2EE54.jsp</a>
</body>
</html>