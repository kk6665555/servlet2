<%@tag import="java.util.HashMap"%>
<%@ tag dynamic-attributes="product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	out.print("<h1>Big Company</h1>");
	HashMap<String,String> ps = (HashMap)jspContext.getAttribute("product");
	if(ps.containsKey("name")){
		out.print(ps.get("name"));
	}
	
		
%>

<table border="1" width="100%">
	<tr>
		<th>item
		<th>value
		
</table>