<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="create" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<create:test1/>
	<hr>
	<create:test2 user="one"></create:test2>
	<hr>
	<create:test3 x="10" y="2">
	10+2=${add }<br>
	10-2=${sub }<br>
	10x2=${meltiply }<br>
	10/2=${divide }<br>
	
	</create:test3>
	${add }<!-- 只有活在doBody裡面 -->
<create:test4 name="Mouse" id="13" price="30"/>
<create:test5 name="Mouse" id="13" price="30"/>



	
	
	
</body>
</html>