<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Upload de arquivo</h1>
        <c:if test="${msg != null}">
            <p><c:out value="${msg}" /></p>
        </c:if>   
        <p>OBS: Para testes criar o diretório C:\desenv\uploads antes de enviar arquivo</p>
        <form action="${pageContext.request.contextPath}/upload" 
              method="post" enctype="multipart/form-data">
            <input type="file" name="arquivo" />
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
