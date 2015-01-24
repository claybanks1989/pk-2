<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

	<script src="http://cdn.alloyui.com/2.5.0/aui/aui-min.js"></script>
	<script src="<c:url value="/resources/js/util.js" />"></script>
	<link href="http://cdn.alloyui.com/2.5.0/aui-css/css/bootstrap.min.css" rel="stylesheet"></link>
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"></link>
</head>
<body>
<div id="addedContainer">
	 <c:forEach items="${msg}" var="employee">
            <tr>
                <td><c:out value="${employee.id}" /></td>
                <td><c:out value="${employee.name}" /></td>
                <td><c:out value="${employee.age}" /></td>
                <td><c:out value="${employee.email}" /></td>
            </tr>
        </c:forEach>
</div>
</body>
</html>