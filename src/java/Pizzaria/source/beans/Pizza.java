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
    
    public Pizza(){
        
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
