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
