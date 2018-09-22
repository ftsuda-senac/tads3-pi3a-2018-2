<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo JSP com Scriptlet</h1>
        <%
            String texto = "XPTO";
            for (int i = 0; i < 100; i++) {
        %>
        <p>Item <%= texto %> <%= i %></p>
        <%
        }    
        %>
    </body>
</html>
