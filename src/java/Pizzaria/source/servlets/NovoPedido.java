/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.servlets;

import Pizzaria.source.beans.Complemento;
import Pizzaria.source.beans.Pedido;
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
        double valor = 0;        
        String[] complemento = req.getParameterValues("complemento");
        String dadosComplemento = ""; 
        int i;
        
        switch(nomeProduto){ // Atribui um valor ao produto de acordo com a pizza escolhida
            case "mussarela":
                valor = 10;
            break;
            case "calabresa":
                valor = 12;
            break;
            case "Frango Catup":
                valor = 15;
            break;
            default : System.out.println("ERRO AO ESCOLHER PIZZA / VALOR DIFERENTE OU VAZIO");
        }
        
        Pedido pedido = new PedidoMeioDaSemana();
        pedido.NovoPedido(nomeCliente,endereco,nomeProduto,valor);// CHAMADA DO MÉTODO TEMPLATE
        
        for(i=0; i<complemento.length;i++){ // "DECORA" o produto do pedido com os complementos selecionados
            dadosComplemento = complemento[i];
            pedido.produto = new Complemento(dadosComplemento, valor, pedido.produto);
        }
        
        req.setAttribute("produto", pedido);
        return "WEB-INF/paginas/exibePedido.jsp";
    }
}
