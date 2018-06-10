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
        System.out.println("Pedido no meio da semana não ganha desconto");
    }
    
}
