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

public class Complemento extends PizzaDecorator{ // Decorator CONCRETO     
    @Inject
        
    public Complemento(String nome, double preco, Produto produto) {
        super(nome, preco, produto);
    }

    @Override
    public double getPreco() {
        return this.preco + produto.getPreco();
    }

    @Override
    public String getNome() {
        return produto.getNome()+ " + " + this.nome;
    }

    @Override
    public void setPreco(double preco) {
        
    }

    @Override
    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
