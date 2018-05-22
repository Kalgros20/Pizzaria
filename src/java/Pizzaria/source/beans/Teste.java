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
        Cliente cli = null; // criação do objeto Cliente sem instanciá-lo
        cli.INSTANCE.setNome("Victor Marciano"); // atribuindo os valores ao objeto através dos setters
        cli.INSTANCE.setEndereco("Rua Lourdes Rabello - Vila Galvão"); // atribuindo os valores ao objeto através dos setters
        
        Pedido pedido1 = new Pizza("Pizza com Decorator", 10); // atribuição dos valores da pizza no pedido
        pedido1 = new Complemento("Borda Recheada", 5, pedido1); // Pizza "Decorada"       
         // Chamada do objeto Singleton
        System.out.println("Pizza: " + pedido1.getNome() + "\nValor a pagar: R$"+pedido1.getPreco()); // Imprime os valor da pizza e seus complementos
        System.out.println("Cliente: " + cli.INSTANCE.getNome() + "\nEndereço: "+cli.INSTANCE.getEndereco());
        System.out.println("\nEndereco do objeto na memoria: " + cli.INSTANCE.hashCode()); // exibindo o endereço do objeto na memoria
        System.out.println("\nEndereco do pedido na memoria: " + pedido1.hashCode()); // o valor será diferente do segundo
        // Novo Pedido
        
        Pedido pedido2 = new Pizza("Pizza sem Decorator", 10); // Pizza sem implementação do decorator
        System.out.println("\nPizza: " + pedido2.getNome() + "\nValor a pagar: R$"+pedido2.getPreco()); // Imprime os valor da pizza e seus complementos
        
        cli.INSTANCE.setNome("Novo nome"); // sobreescreve os dados utilizando a mesma instancia
        cli.INSTANCE.setEndereco("Novo endereco");        
        
        // exibindo o endereço do objeto/pedido na memoria(se o valor for o mesmo da instancia anterior é porque o Singleton está correto)
        
        System.out.println("Cliente: " + cli.INSTANCE.getNome() + "\nEndereço: " + cli.INSTANCE.getEndereco());       
        System.out.println("\nEndereco do objeto na memoria: " + cli.INSTANCE.hashCode());
        System.out.println("\nEndereco do pedido na memoria: " + pedido2.hashCode()); // o valor será diferente do primeiro
    }
}
