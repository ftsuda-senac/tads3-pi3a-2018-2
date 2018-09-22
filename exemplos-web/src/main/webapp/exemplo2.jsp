<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo JSP com JSTL + EL</h1>
        <c:forEach begin="0" end="99" varStatus="stat">
            <p>Item XPTO <c:out value="${stat.index}" /></p>
        </c:forEach>
    </body>
</html>
