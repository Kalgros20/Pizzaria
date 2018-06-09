/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.beans;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

/**
 *
 * @author Marciano
 */

@Decorator
public abstract class PizzaDecorator implements Produto{ // DECORATOR ABSTRATO
    @Any
    @Inject
    @Delegate
    
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
