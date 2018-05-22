/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizzaria.source.beans;

/**
 *
 * @author carlysson
 */
public class Pizza implements Produto{
    private String nome;
    private double preco;
    
    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibePizza(){
        System.out.println("Pizza: " + this.getNome() + "\nValor a pagar: R$" + this.getPreco());
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
    
    
}
