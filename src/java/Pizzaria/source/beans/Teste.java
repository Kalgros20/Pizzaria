/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marciano
 */
public class Teste {
    public static void main(String[] args){        
        Pedido pedido = new PedidoFimDaSemana();         
        List<String> complemento = new ArrayList();
        complemento.add("borda de cheddar");
        complemento.add("coca cola");
        
        //pedido.NovoPedido("victor", "avenida salgado filho", "Pizza de Calabresa", complemento);
        System.out.println("Produto: " + pedido.produto.getNome() 
                + "\nValor a pagar: " + pedido.produto.getPreco()
                + "\nCliente: "+ pedido.cliente.getNome() + "\nEndereço: "+ pedido.cliente.getEndereco()
        );
        
        Pedido pedido2 = new PedidoMeioDaSemana();
        //pedido2.NovoPedido("antonio", "vila galvão", "Pizza de Mussarela", "borda de catupiry");
        System.out.println("Produto: " + pedido2.produto.getNome() 
                + "\nValor a pagar: " + pedido2.produto.getPreco()
                + "\nCliente: "+ pedido2.cliente.getNome() + "\nEndereço: "+ pedido2.cliente.getEndereco()
        );
    }
}
