<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="member" class="tw.mike.beans.Member"></jsp:useBean>
<jsp:setProperty property="id" name="member" value="004"/>
<jsp:setProperty property="name" name="member" value="Mike"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Weclome,${member["name"]}${member["id"]}<br>
<jsp:getProperty property="name" name="member"/>

</body>
</html>