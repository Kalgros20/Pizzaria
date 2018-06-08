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
public class PedidoMeioDaSemana extends Pedido{

    @Override
    void AplicaDesconto() {   
        double precoAtual = this.produto.getPreco();        
        this.produto.setPreco(precoAtual * 0.75);
        System.out.println("Pedido no meio da semana ganha desconto de 25% no valor do pedido");
    }    
}
