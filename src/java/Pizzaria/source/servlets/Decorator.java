/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.servlets;

import Pizzaria.source.beans.Complemento;
import Pizzaria.source.beans.Pizza;
import Pizzaria.source.beans.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlysson
 */
@WebServlet(name = "Decorator", urlPatterns = {"/Decorator"})
public class Decorator extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Decorator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Decorator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nome = request.getParameter("nome");
        String valor = request.getParameter("valor");
        double parseDouble = Double.parseDouble(valor);
        
        //Produto produto1 = new Pizza(nome, parseDouble); // atribuição dos valores da pizza no pedido
        System.out.println("entrou na servlet");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/paginas/exibePedido.jsp");
            requestDispatcher.forward(request, response);
    }

}
