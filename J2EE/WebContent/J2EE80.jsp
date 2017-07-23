<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/oneone"
 user="root" password="root"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:transaction><!-- 一次性交易 只要一個沒成功就不會執行 -->
	<sql:update var="n" sql="insert into member(account,password,realname) values(?,?,?)">
		<sql:param>mike</sql:param>
		<sql:param>33446</sql:param>
		<sql:param>mike11</sql:param>
	</sql:update>
	<sql:query var="lastid">
		select last_insert_id() as newid
	
	</sql:query>
</sql:transaction>

<c:if test="${n>=1 }">
	Last_id:${lastid.rows[0].newid }
</c:if>


</body>
</html>