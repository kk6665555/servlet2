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
<sql:query sql="SELECT * FROM MEMBER" var="result"></sql:query>

<sql:update var="count">
INSERT INTO MEMBER(ACCOUNT,PASSWORD,REALNAME) VALUES(?,?,?)
<sql:param>1</sql:param>
<sql:param>12</sql:param>
<sql:param>123</sql:param>
</sql:update>

${count }
<hr>



</body>
</html>