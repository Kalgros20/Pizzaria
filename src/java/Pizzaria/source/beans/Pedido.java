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
public abstract class Pedido {    
    Cliente cliente;
    Produto produto;   
    
    final void NovoPedido() { // TEMPLATE METHOD
        getProduto();
        getCliente();
        AplicaDesconto();
    }

    // método de desconto terá comportamento alterado dependendo da classe que o chamar
    
    abstract void AplicaDesconto();    
    
    // métodos que não sofrerão alteração de comportamento
    
    final void getProduto(){        
        System.out.println("Produto adicionado ao pedido");
    }
    
    final void getCliente(){
        System.out.println("Cliente adicionado ao pedido");
    }       
}
