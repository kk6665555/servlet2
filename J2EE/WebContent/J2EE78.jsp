<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/oneone"
 user="root" password="root"/>
 
<c:if test="${!empty param.delid }">
	<sql:update>
		delete from MEMBER where id = ?
		<sql:param>${param.delid }</sql:param>
	</sql:update>
</c:if>


<sql:query sql="select * from member" var="result"></sql:query>
<table border="2" width="100%">
	<tr>
			<th>id
			<th>account
			<th>password
			<th>realname
			<th>Delete
			<th>Edit

<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.id }
			<td>${row.account }
			<td>${row.password }
			<td>${row.realname }
			<td><a href="?delid=${row.id }">Delect</a>
			<td><a href="J2EE79.jsp?editid=${row.id }">Edit</a>
</c:forEach>	
</table>
</body>
</html>