<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] names = {"zero","one","two","three"};
	pageContext.setAttribute("names", names);
	pageContext.setAttribute("step", 1);

%>
<table border="2" width=100%>
	<tr>
		<th>index
		<th>Name
		<th>count	
		<th>first
		<th>last
	<c:forEach items="${names }" var="name" varStatus="status" begin="0" end="4" step="${step }">
	<tr>
		<td>${status.index }
		<td>${name }
		<td>${status.count }
		<td>${status.first }
		<td>${status.last }
		
	
	</c:forEach>
	
</table>
<hr>
<%
	String line = "1,路人甲,male,0911-111-111,21070709,tw";
	pageContext.setAttribute("line", line);
%>
<c:forTokens items="${line}" delims="," var="field" varStatus="status1">
	${status1.count}:${field }<br>
</c:forTokens>
<hr>
<c:import var="data" url="http://www.tutorialspoint.com"></c:import>
<!--<c:out value="${data }"></c:out>-->
<c:import url="J2EE71.jsp" var="data2">
	<c:param name="x" value="1"></c:param>
	<c:param name="y" value="2"></c:param>
</c:import>
<c:out value="${data2 }"></c:out>




</body>
</html>