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
        <%-- <jsp:include page="cabecalho.jsp" /> --%>
        <c:import url="cabecalho.jsp" />
        <div>
            <h2>Opções</h2>
            <c:if test="${sessionScope.usuario.verificarPapel('PEAO')}">
                <div>
                    <a href="${pageContext.request.contextPath}/protegido/peao-page">PEAO Page</a>
                </div>
            </c:if>
            <c:if test="${sessionScope.usuario.verificarPapel('FODON')}">
                <div>
                    <a href="${pageContext.request.contextPath}/protegido/fodon-page">FODON Page</a>
                </div>
            </c:if>
            <c:if test="${sessionScope.usuario.verificarPapel('GOD')}">
                <div>
                    <a href="${pageContext.request.contextPath}/protegido/god-page">GOD Page</a>
                </div>
            </c:if>
        </div>
            
    </body>
</html>
