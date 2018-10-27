<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home</h1>
        <c:if test="${sessionScope.usuario != null}">
            <h2>Nome completo: <c:out value="${sessionScope.usuario.nomeCompleto}" /></h2>
            <p><c:out value="${sessionScope.usuario.hashSenha}" /></p>
        </c:if>
    </body>
</html>
