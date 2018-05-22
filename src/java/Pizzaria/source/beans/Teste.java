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
        Cliente cli = null;
        cli.INSTANCE.NovoCliente("Victor Marciano", "Rua Lourdes Rabello - Vila Galvão");
        cli.INSTANCE.ExibeCliente();
        
        Produto produto1 = new Pizza("Pizza com Decorator", 10); // atribuição dos valores da pizza no pedido
        produto1 = new Complemento("Borda Recheada", 5, produto1); // Pizza "Decorada" 
        
        System.out.println("Pizza: " + produto1.getNome() + "\nValor a pagar: R$"+produto1.getPreco()); // Imprime os valor da pizza e seus complementos
        //System.out.println("Cliente: " + cli.INSTANCE.getNome() + "\nEndereço: "+cli.INSTANCE.getEndereco());
        
        Cliente cli2 = null;
        cli2.INSTANCE.NovoCliente("Maria das Dores", "Avenida Timóteo Penteado - Centro"); // sobrescreve a instancia ja existente
        cli2.INSTANCE.ExibeCliente(); // exibe os dados do novo cliente e o valor do objeto(se for igual o anterior o Singleton está correto)
                                
        Produto produto2 = new Pizza("Pizza sem Decorator", 10); // Pizza sem implementação do decorator
        
        System.out.println("\nPizza: " + produto2.getNome() + "\nValor a pagar: R$"+produto2.getPreco()); // Imprime os valor da pizza e seus complementos
    }
}
