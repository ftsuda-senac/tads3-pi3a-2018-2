/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.exemplos.web;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "UploadArquivoServlet", urlPatterns = {"/upload"})
@MultipartConfig
public class UploadArquivoServlet extends HttpServlet {

//    private File diretorio;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        String path = config.getInitParameter("diretorio");
//        diretorio = new File(path);
//        diretorio.mkdirs();
//    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/WEB-INF/jsp/upload.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    // Obtido em https://stackoverflow.com/a/2424824
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Part filePart = request.getPart("arquivo"); // Retrieves <input type="file" name="arquivo">

        String nomeArquivo = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
        InputStream conteudoArquivo = filePart.getInputStream();

        // **** TRATAR O InputStream conforme necessidade
        // Pega os bytes e salva no disco
        Path destino = Paths.get("C:/desenv/uploads/"
                + nomeArquivo);
        Files.copy(conteudoArquivo, destino);

        request.setAttribute("msg", "Arquivo carregado com sucesso.");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/WEB-INF/jsp/upload.jsp");
        dispatcher.forward(request, response);
    }

}
