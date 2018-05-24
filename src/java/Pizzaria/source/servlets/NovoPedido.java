/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.servlets;

import Pizzaria.source.beans.Pedido;
import Pizzaria.source.beans.PedidoMeioDaSemana;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marciano
 */
public class NovoPedido implements Tarefa {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) {        
        String nomeCliente = req.getParameter("nome_cliente");
        String endereco = req.getParameter("endereco");
        String nomeProduto = req.getParameter("nomePizza");        
        double valor = Double.parseDouble(req.getParameter("valor"));
        
        Pedido pedido = new PedidoMeioDaSemana();
        pedido.NovoPedido(nomeCliente,endereco,nomeProduto,valor);// CHAMADA DO MÉTODO TEMPLATE
        
        req.setAttribute("produto", pedido.produto);
        return "WEB-INF/paginas/exibePedido.jsp";
    }
}
