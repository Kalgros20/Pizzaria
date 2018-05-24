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
    public Cliente cliente;
    public Produto produto;   
    
    public final void NovoPedido(String cliente, String endereco, String pizza, double valor) { // TEMPLATE METHOD
        NovoProduto(pizza, valor);
        NovoCliente(cliente, endereco);
        AplicaDesconto();
    }

    // método de desconto terá comportamento alterado dependendo da classe que o chamar
    
    abstract void AplicaDesconto();    
    
    // métodos que não sofrerão alteração de comportamento
    
    public final void NovoProduto(String nome, double valor){         
        Pizza.INSTANCE.setNome(nome);
        Pizza.INSTANCE.setPreco(valor);
        this.produto = Pizza.INSTANCE;
        //this.produto = new Complemento("borda recheada de catupiry", 5, produto); // adicionando complemento com DECORATOR
        //this.produto = new Complemento("Coca Cola 2Litros", 7, produto); // adicionando complemento com DECORATOR        
    }
    
    public final void NovoCliente(String nome, String endereco){         
        Cliente.INSTANCE.setNome(nome); // criação do objeto Singleton
        Cliente.INSTANCE.setEndereco(endereco); // sobreescrita de atributo via setter
        this.cliente = Cliente.INSTANCE; // sobreescrita de atributo via setter        
    }       
}
