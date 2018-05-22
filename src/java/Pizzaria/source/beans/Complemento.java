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
public class Complemento extends PizzaDecorator{
    public Complemento(String label, double preco, Produto pedido) {
        super(label, preco, pedido);
    }

    @Override
    public double getPreco() {
        return this.preco + pedido.getPreco();
    }

    @Override
    public String getNome() {
        return pedido.getNome()+ " + " + this.nome;
    }
}
