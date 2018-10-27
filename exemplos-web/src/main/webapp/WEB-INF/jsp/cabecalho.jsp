<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
    <c:if test="${sessionScope.usuario != null}">
        <h2>Nome completo: <c:out value="${sessionScope.usuario.nomeCompleto}" /></h2>
        <p><c:out value="${sessionScope.usuario.hashSenha}" /></p>
        <p><c:out value="${sessionScope.usuario.username}" /></p>
        <p><a href="${pageContext.request.contextPath}/logout">Sair</a></p>
    </c:if>
</div>
