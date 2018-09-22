<%@page import="br.senac.tads.pi3a.exemplos.web.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Produto> lista = new ArrayList<>();
            Produto p1 = new Produto();
            p1.setId(1L);
            p1.setNome("Produto 1");
            p1.setPrecoVenda(90);
            lista.add(p1);
            
            Produto p2 = new Produto();
            p2.setId(2L);
            p2.setNome("Produto 2");
            p2.setPrecoVenda(120);
            lista.add(p2);
            
            Produto p3 = new Produto();
            p3.setId(3L);
            p3.setNome("Produto 3");
            p3.setPrecoVenda(70);
            lista.add(p3);
            
            request.setAttribute("sexta", lista);
        %>
        <h1>Lista de produtos</h1>
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
