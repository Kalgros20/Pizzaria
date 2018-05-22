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
public abstract class PizzaDecorator implements Pedido{
    protected Pedido pedido;
    protected String nome;
    protected double preco;

    public PizzaDecorator(String nome, double preco, Pedido pedido) {
        this.nome = nome;
        this.preco = preco;
        this.pedido = pedido;
    }

    // O preço é delegado para a implementação concreta
    public abstract double getPreco();

    // Label default é fornecido
    public String getLabel() {
        return pedido.getNome() + ", " + this.nome; // alteração do comportamento em tempo de execução (retorno do nome da pizza + do complemento que foi pedido)
    }
}
