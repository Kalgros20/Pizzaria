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
public abstract class Pedido {    
    public Cliente cliente;
    public Produto produto;    
    
    public final void NovoPedido(String cliente, String endereco, String pizza, String[] complemento) { // TEMPLATE METHOD        
        // chamada dos métodos abaixo de forma automatica com a chamada do método template
        NovoProduto(pizza);
        NovoComplemento(complemento);        
        AplicaDesconto();
        NovoCliente(cliente, endereco);         
    }

    // método de desconto terá comportamento alterado dependendo da classe que o chamar
    
    abstract void AplicaDesconto();    
    
    // métodos que não sofrerão alteração de comportamento
    
    final void NovoProduto(String nome){        
        this.produto = new Pizza(nome, getValorPedido(nome));              
    }
    
    final void NovoCliente(String nome, String endereco){         
        Cliente.INSTANCE.setNome(nome); // criação do objeto Singleton
        Cliente.INSTANCE.setEndereco(endereco); // sobreescrita de atributo via setter
        this.cliente = Cliente.INSTANCE; // sobreescrita de atributo via setter        
    }

    final void NovoComplemento(String[] complemento){
        for (int i = 0; i < complemento.length; i++) {
            this.produto = new Complemento(complemento[i], 2, this.produto);
        }        
    }
    
    final double getValorPedido(String nomeProduto){ 
        double valor = 0;
        switch(nomeProduto){ // Atribui um valor ao produto de acordo com a pizza escolhida
            case "Pizza de Mussarela":
                valor = 15;
            break;
            case "Pizza de Calabresa":
                valor = 20;
            break;
            case "Pizza de Frango com Catupiry":
                valor = 25;
            break;           
        } 
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }
    
}
