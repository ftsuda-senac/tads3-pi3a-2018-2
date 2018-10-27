/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "Opcao1Servlet", urlPatterns = {"/opcao1"})
public class Opcao1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String opt = request.getParameter("opt");
        
        if (opt != null) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("opcaoSelecionada", opt);
        }
        
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher(
                        "/WEB-INF/jsp/opcao1.jsp");
        dispatcher.forward(request, response);
    }

}
