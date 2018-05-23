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
        // Criação de um novo pedido através de composição e polimorfismo
        
        Pedido pedido = new PedidoFimDeSemana();
        pedido.produto = new Pizza("Pizza de Calabresa", 10);
        pedido.cliente = Cliente.INSTANCE.NovoCliente("Victor Marciano", "Vila Galvão"); // Cliente Singleton
        
        System.out.println(" \nCliente: " +pedido.cliente.getNome() + "\nEndereço: " + pedido.cliente.getEndereco());
        System.out.println(" Produtos : " +pedido.produto.getNome());
        System.out.println(" Valor a pagar : " +pedido.produto.getPreco());
        
        Pedido pedido2 = new PedidoMeioDaSemana(); 
        pedido2.produto = new Pizza("Pizza de Mussarela", 15);
        pedido2.produto = new Complemento("Borda recheada com Catupiry" , 5 , pedido2.produto); // Pizza com decorator
        pedido2.cliente = Cliente.INSTANCE.NovoCliente("Maria das dores", "Centro"); // Cliente Singleton(mesmo objeto)
        
        System.out.println(" \nCliente: " +pedido2.cliente.getNome() + "\nEndereço: " + pedido2.cliente.getEndereco());
        System.out.println(" Produtos : " +pedido2.produto.getNome());
        System.out.println(" Valor a pagar : " +pedido2.produto.getPreco());
    }
}
