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
        NovoProduto();
        NovoCliente();
        AplicaDesconto();
    }

    // método de desconto terá comportamento alterado dependendo da classe que o chamar
    
    abstract void AplicaDesconto();    
    
    // métodos que não sofrerão alteração de comportamento
    
    final void NovoProduto(){ 
        this.produto = new Pizza("Pizza DECORATOR de Calabresa", 15); // polimorfismo / criação de uma pizza 
        this.produto = new Complemento("borda recheada de catupiry", 5, produto); // adicionando complemento com DECORATOR
        this.produto = new Complemento("Coca Cola 2Litros", 7, produto); // adicionando complemento com DECORATOR        
    }
    
    final void NovoCliente(){         
        this.cliente = Cliente.INSTANCE; // criação do objeto Singleton
        this.cliente.setNome("Victor Marciano"); // sobreescrita de atributo via setter
        this.cliente.setEndereco("Rua Lourdes Rabello"); // sobreescrita de atributo via setter        
    }       
}
