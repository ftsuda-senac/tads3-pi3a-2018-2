/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "ExemploServlet", urlPatterns = {"/exemplo"})
public class ExemploServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TesteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Teste Servlet</h1>");
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            out.println("<p>Data e hora do processamento: " + dateFormat.format(new Date()) + "</p>");
            for (int i = 0; i < 100; i++) {
                out.println("<p>Item " + i + "</p>");
            }
            out.println("</body>");
            out.println("</html>");
        }

    }

}
