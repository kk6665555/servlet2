<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%//request==req同一個物件實體
	String method = request.getMethod();
	//pageContext
	HttpServletRequest req = 
			(HttpServletRequest)pageContext.getRequest();
	String queryString =  req.getQueryString();
	
	String user= req.getParameter("user");
	String password= req.getParameter("password");
	
	String ip =req.getRemoteAddr();
	
%>
Method=<%=method %><br/>
queryString=<%=queryString %><br/>
user=<%=user %><br/>
password=<%=password %><br/>
ip=<%=ip %><br/>
Method:${pageContext.request.method }<br/><!-- method 為屬性 不是方法 -->
queryString:${pageContext.request.queryString }<br/>


</body>
</html>