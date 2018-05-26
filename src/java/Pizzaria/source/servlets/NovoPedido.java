/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.servlets;

import Pizzaria.source.beans.Complemento;
import Pizzaria.source.beans.Pedido;
import Pizzaria.source.beans.PedidoMeioDaSemana;
import Pizzaria.source.beans.Produto;
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
        String complemento = req.getParameter("complemento");
        double valor = Double.parseDouble(req.getParameter("valorPizza"));
        
        Pedido pedido = new PedidoMeioDaSemana();
        pedido.NovoPedido(nomeCliente,endereco,nomeProduto,valor);// CHAMADA DO MÉTODO TEMPLATE
        pedido.NovoCliente(nomeCliente, endereco);// USO DO SINGLETON
        pedido.NovoProduto(nomeProduto, valor); //USO DO SINGLETON
        
        if(complemento != null){
            pedido.novoComplemento(complemento, 2); //USO DO DECORATOR
        }
        
        req.setAttribute("produto", pedido.produto);
        req.setAttribute("cliente", pedido.cliente);
        return "WEB-INF/paginas/exibePedido.jsp";
    }
}
