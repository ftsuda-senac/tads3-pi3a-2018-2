<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Opção 2</h1>
        <div>
            <a href="${pageContext.request.contextPath}/opcao2?opt=1">Opção 1</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao2?opt=2">Opção 2</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao2?opt=3">Opção 3</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao2?opt=4">Opção 4</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao2">Voltar</a>
        </div>
        <c:if test="${sessionScope.opcoesSelecionadas != null && !sessionScope.opcoesSelecionadas.isEmpty()}">
            <hr />
            <ul>
                <c:forEach var="opcao" 
                items="${sessionScope.opcoesSelecionadas}">
                    <li><c:out value="${opcao}" /></li>
                </c:forEach>
            </ul>  
        </c:if>
    </body>
</html>







