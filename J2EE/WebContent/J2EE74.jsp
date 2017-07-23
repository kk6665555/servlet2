<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Locale local = request.getLocale();

%>
Locale:<%=local.getCountry() %><br>
Locale:<%=local.getDisplayCountry() %><br>
Locale:<%=local.getLanguage()%>
<hr>
<fmt:setBundle basename="res"/>
<fmt:message key="Hello"/><fmt:message key="World"/>
<hr>
<fmt:message key="CompanyName"/>
<hr>
<%
Date now = new Date();
out.print(now);
pageContext.setAttribute("now", now);
%>
<hr>
<fmt:setTimeZone value="GMT+2"/>
<fmt:formatDate value="${now}" type="both" dateStyle="long"/>
<hr>
<fmt:setTimeZone value="Asia/Taipei"/>
<fmt:formatDate value="${now}" type="both" dateStyle="long"/>
<hr>
Defalt:<fmt:formatNumber value="${1234567.890123} "/>
<hr>
沒有千分位:<fmt:formatNumber value="${1234567.890123} " groupingUsed="false"/><!--  groupingUsed 千分位 -->
<hr>
最多位數<fmt:formatNumber value="${1234567.890123} " maxIntegerDigits="4"/>
<hr>
最少位數<fmt:formatNumber value="${1234567.890123} " minIntegerDigits="8"/><!-- 缺的補0 -->
<hr>
小數點最多兩位:<fmt:formatNumber value="${1234567.890123}" maxFractionDigits="2" />
<hr>
<fmt:formatNumber value="${123}" type="currency" currencyCode="JPY" />




</body>
</html>