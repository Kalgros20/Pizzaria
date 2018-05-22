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
public abstract class Pedido {
    
    final void NovoPedido() { // TEMPLATE METHOD
        getProduto();
        getCliente();
        AplicaDesconto();
    }

    abstract void AplicaDesconto();    
    
    final void getProduto(){
        
    }
    
    final void getCliente(){
        
    }
   
    
}
