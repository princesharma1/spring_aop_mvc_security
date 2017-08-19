<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h1>HTTP Status 403 - Access is denied</h1>

	<h2>${msg}</h2>

<c:if test="${pageContext.request.userPrincipal.name!=null }">
	<c:url var="logoutUrl" value="/logout" />
	<form action="${logoutUrl}" method="POST">
		<input type="submit" value="Logout" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</c:if>   
</body>
</html>
                                        