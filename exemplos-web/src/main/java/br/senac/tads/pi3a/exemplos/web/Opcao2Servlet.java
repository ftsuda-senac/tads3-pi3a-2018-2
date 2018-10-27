/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "Opcao2Servlet", urlPatterns = {"/opcao2"})
public class Opcao2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Recupera valor selecionado pelo usuario
        String opt = request.getParameter("opt");

        if (opt != null) {
            // Recupera ou cria uma lista q mantem opcoes do usuario
            List<String> opcoesSelecionadas = null;
            HttpSession sessao = request.getSession();
            if (sessao.getAttribute("opcoesSelecionadas") != null) {
                opcoesSelecionadas
                        = (List<String>) sessao.getAttribute("opcoesSelecionadas");
            } else {
                opcoesSelecionadas = new ArrayList<>();
            }
            // Adiciona a opção selecionada pelo usuário
            opcoesSelecionadas.add(opt);

            // Adiciona a lista alterada na sessão
            sessao.setAttribute("opcoesSelecionadas",
                    opcoesSelecionadas);
        }
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/WEB-INF/jsp/opcao2.jsp");
        dispatcher.forward(request, response);
    }

}
