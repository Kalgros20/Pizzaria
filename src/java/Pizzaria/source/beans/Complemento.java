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
public class Complemento extends PizzaDecorator{ // Decorator CONCRETO
    public Complemento(String label, double preco, Produto produto) {
        super(label, preco, produto);
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
}
