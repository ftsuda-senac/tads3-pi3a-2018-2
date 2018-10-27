/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import br.senac.tads.pi3a.exemplos.web.modelo.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
@WebServlet(name = "InclusaoProdutoServlet", urlPatterns = {"/produto/inclusao"})
public class InclusaoProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(
                        "/WEB-INF/jsp/produto/formulario.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String prCompraStr = request.getParameter("prcompra");
        String prVendaStr = request.getParameter("prvenda");
        String qtdStr = request.getParameter("qtd");
        String dispStr = request.getParameter("disp");
        String[] cats = request.getParameterValues("cat");
        BigDecimal prCompra = new BigDecimal(prCompraStr);
        BigDecimal prVenda = new BigDecimal(prVendaStr);
        int qtd = Integer.parseInt(qtdStr);
        int disp = Integer.parseInt(dispStr);
        
        Produto produto = new Produto(nome, descricao, 
                prCompra, prVenda, qtd, disp, cats);
        
        request.setAttribute("prod", produto);
        
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher(
                        "/WEB-INF/jsp/produto/resultado.jsp");
        dispatcher.forward(request, response);

        
    }

}
