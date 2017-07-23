<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	String uploadpath = pageContext.getServletContext().getInitParameter("upload-path");
	MultipartRequest req = new MultipartRequest(request,uploadpath,"UTF-8");
	
	Enumeration items= req.getFileNames();
	Enumeration params = req.getParameterNames();
	while(params.hasMoreElements()){
		String param =(String)params.nextElement();
		String value = req.getParameter(param);
		out.println(param + value+"<br>");
	}

%>
</body>
</html>