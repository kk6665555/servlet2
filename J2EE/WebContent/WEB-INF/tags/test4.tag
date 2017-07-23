<%@ tag dynamic-attributes="product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	out.print("<h1>Big Company</h1>");
%>


<table border="1" width="100%">
	<tr>
		<th>item
		<th>value
		
		<c:forEach var="prod" items="${product }">
			<tr>
				<td>${prod.key }
				<td>${prod.value }
		</c:forEach>
</table>