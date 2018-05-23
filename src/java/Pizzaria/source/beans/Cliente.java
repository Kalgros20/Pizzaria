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
public enum Cliente { // Singleton implementado via enumeração
    INSTANCE; // Constante Singleton
    
    private String nome;
    private String endereco;
    
    Cliente(){} // Construtor private(por padrão) vazio
    
    public Cliente NovoCliente(String nome, String endereco){
        Cliente cliente = Cliente.INSTANCE;
        cliente.setNome(nome);
        cliente.setEndereco(endereco);        
        return cliente; 
    }
    
    public void ExibeCliente(){        
        System.out.println("Cliente: "+ this.INSTANCE.getNome());
        System.out.println("Endereço: "+ this.INSTANCE.getEndereco());
        System.out.println("Endereco do objeto na memoria: " + this.INSTANCE.hashCode()); // exibindo o endereço do objeto na memoria
        System.out.println("--------------------------------------------------------------------");
    }
       
    public String getNome() {
       return this.nome; 
    }   

    public String getEndereco() {
       return this.endereco; 
    }   
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
