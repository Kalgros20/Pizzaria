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
public class Teste {
    public static void main(String[] args){
        Pedido pizza = new Pizza("Pizza de Calabresa", 10); // atribuição dos valores da pizza
        pizza = new Complemento("Borda Recheada", 5, pizza); // Pizza "Decorada" 
        System.out.println("Pizza: " + pizza.getNome() + "\nValor a pagar: R$"+pizza.getPreco()); // Imprime os valor da pizza e seus complementos
    }
}
