/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.beans;

import javax.inject.Inject;

/**
 *
 * @author Marciano
 */
public class Desconto extends PizzaDecorator{
    @Inject
        
    public Desconto(String nome, double preco, Produto produto) {
        super(nome, preco, produto);
    }

    @Override
    public double getPreco() {
        return produto.getPreco() * this.preco;
    }

    @Override
    public String getNome() {
        return produto.getNome()+ " + " + this.nome;
    }
}
