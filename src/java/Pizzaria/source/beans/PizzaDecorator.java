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
public abstract class PizzaDecorator implements Produto{
    protected Produto pedido;
    protected String nome;
    protected double preco;

    public PizzaDecorator(String nome, double preco, Produto pedido) {
        this.nome = nome;
        this.preco = preco;
        this.pedido = pedido;
    }

    // Delegações para a implementação concreta
    
    @Override
    public abstract double getPreco();
    
    @Override
    public abstract String getNome();      
    
}
