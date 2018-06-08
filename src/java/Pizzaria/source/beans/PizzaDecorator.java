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
public abstract class PizzaDecorator implements Produto{ // DECORATOR ABSTRATO
    protected Produto produto;
    protected String nome;
    protected double preco;

    public PizzaDecorator(String nome, double preco, Produto produto) {
        this.nome = nome;
        this.preco = preco;
        this.produto = produto;
    }

    // Delegações para a implementação concreta
    
    @Override
    public abstract double getPreco();
    
    @Override
    public abstract String getNome();      
    
}
