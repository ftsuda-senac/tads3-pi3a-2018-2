<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de produtos Servlet + JSP</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Preço</th>
            </tr>
            <c:forEach items="${sexta}" var="p">
                <tr>
                    <td><c:out value="${p.getId()}" /></td>
                    <td><c:out value="${p.getNome()}" /></td>
                    <td><c:out value="${p.getPrecoVenda()}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
