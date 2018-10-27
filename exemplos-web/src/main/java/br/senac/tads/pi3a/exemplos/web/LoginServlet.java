/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import br.senac.tads.pi3a.exemplos.web.modelo.UsuarioSistema;
import br.senac.tads.pi3a.exemplos.web.service.UsuarioSistemaService;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/WEB-INF/jsp/login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String senhaAberta = request.getParameter("senha");

        UsuarioSistemaService service = new UsuarioSistemaService();

        UsuarioSistema usuario = service.buscarPorUsername(username);
        if (usuario != null) {
            boolean senhaValida = usuario.validarSenha(senhaAberta);
            if (senhaValida) {
                // Login com sucesso.
                HttpSession sessao = request.getSession();
                sessao.setAttribute("usuario", usuario);

//                RequestDispatcher dispatcher
//                        = request.getRequestDispatcher(
//                                "/WEB-INF/jsp/home.jsp");
//                dispatcher.forward(request, response);
                response.sendRedirect(request.getContextPath() + "/home");
                return;
            }
        }

        request.setAttribute("msgErro", "Usuário ou senha inválido");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/WEB-INF/jsp/login.jsp");
        dispatcher.forward(request, response);
    }
}
