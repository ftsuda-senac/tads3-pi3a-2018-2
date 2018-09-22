/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "ProdutoServlet", urlPatterns = {"/produto"})
public class ProdutoServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String nomeProduto = request.getParameter("produto");
        String preco = request.getParameter("preco");

        List<Produto> lista = new ArrayList<>();
        if (nomeProduto != null && preco != null) {
            int precoInt = Integer.parseInt(preco);
            Produto p0 = new Produto();
            p0.setId(10L);
            p0.setNome(nomeProduto);
            p0.setPrecoVenda(precoInt);
            lista.add(p0);
        }
        
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
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("produto-mvc.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
}
