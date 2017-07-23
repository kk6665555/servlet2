<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ attribute name="x" required="true"%>
<%@ attribute name="y" required="true"%>

<%@ variable name-given="add" %>
<%@ variable name-given="sub" %>
<%@ variable name-given="meltiply" %>
<%@ variable name-given="divide" %>

<c:set var="add" value="${x + y }"></c:set>
<c:set var="sub" value="${x - y }"></c:set>
<c:set var="meltiply" value="${x * y }"></c:set>
<c:set var="divide" value="${x / y }"></c:set>

<jsp:doBody></jsp:doBody>