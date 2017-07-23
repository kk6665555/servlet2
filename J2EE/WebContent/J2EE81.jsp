<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
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
<!-- 利用C import 抓遠端資料 -->
<c:import  var="data" url="http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx" ></c:import>

<%
	String strjson = (String)pageContext.getAttribute("data");
	JSONArray root = new JSONArray(strjson);
	for(int i = 0 ;i<root.length();i++){
		JSONObject objdata=root.getJSONObject(i);
		String name = objdata.getString("Name");
		String tel = objdata.getString("Tel");
		String address = objdata.getString("Address");
		out.println(name +":" + tel + ":" + address + "<br>");
	}

%>


</body>
</html>