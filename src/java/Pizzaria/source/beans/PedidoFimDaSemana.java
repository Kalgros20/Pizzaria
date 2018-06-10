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
public class PedidoFimDaSemana extends Pedido{

    @Override
    void AplicaDesconto() {
        System.out.println("Pedidos no fim de semana recebem 50% de desconto!!");
        this.produto = new Desconto("DESCONTO", 0.50, produto);
    }
    
}
