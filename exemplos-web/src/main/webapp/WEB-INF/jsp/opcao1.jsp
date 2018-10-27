<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Opções</h1>
        <p>Opção selecionada: 
        <c:out value="${sessionScope.opcaoSelecionada}" />
        </p>
        
        <div>
            <a href="${pageContext.request.contextPath}/opcao1?opt=1">Opção 1</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao1?opt=2">Opção 2</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao1?opt=3">Opção 3</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao1?opt=4">Opção 4</a>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/opcao1">Voltar</a>
        </div>
    </body>
</html>
