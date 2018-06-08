/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.beans;

/**
 *
 * @author Marciano
 */
public class Teste {
    public static void main(String[] args){      
        // Testando a Criação de um novo pedido através de composição e polimorfismo com o Template method implementado
        
        // Exemplo (TESTE)
        String a = "Victor Marciano",b = "Centro",c = "Pizza Calabresa";
        double d = 15;
        String e = "borda de chocolate";
        Pedido pedido = new PedidoMeioDaSemana();
        pedido.NovoPedido(a,b,c,d,e);// TESTE CHAMADA DO MÉTODO TEMPLATE
        
        System.out.println(" \nCliente: " +pedido.cliente.getNome() + "\nEndereço: " + pedido.cliente.getEndereco());        
        System.out.println(" \nProduto: " +pedido.produto.getNome() + "\nValor a pagar: R$" + pedido.produto.getPreco());       
    }
}
