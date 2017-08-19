<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>


	Admin


	<c:if test="${pageContext.request.userPrincipal.name!=null }">
		<h3>
			Welcome: ${pageContext.request.userPrincipal.name } |

			<!-- <a href="/j_spring_security_logout" title="Logout">Logout</a> -->

			<c:url var="logoutUrl" value="/logout" />
			<form action="${logoutUrl}" method="post">
				<input type="submit" value="Logout" /> <input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>   
		</h3>
	</c:if>
</body>
</html>
