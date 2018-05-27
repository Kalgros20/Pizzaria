/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.servlets;


import Pizzaria.source.beans.Pedido;
import Pizzaria.source.beans.PedidoFimDeSemana;
import Pizzaria.source.beans.PedidoMeioDaSemana;
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
        double valor = 0;        
        
         Pedido pedido = new PedidoMeioDaSemana(); // TESTANDO EM UM PEDIDO NO MEIO DA SEMANA
        //Pedido pedido = new PedidoFimDeSemana();    // TESTANDO EM UM PEDIDO DE FIM DE SEMANA    
        pedido.NovoPedido(nomeCliente,endereco,nomeProduto,valor,complemento);// CHAMADA DO MÉTODO TEMPLATE      
                
        req.setAttribute("produto", pedido.produto);
        req.setAttribute("cliente", pedido.cliente);
        return "WEB-INF/paginas/exibePedido.jsp";
    }
}
