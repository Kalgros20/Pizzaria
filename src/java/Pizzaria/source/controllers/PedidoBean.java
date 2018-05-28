/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.controllers;

import Pizzaria.source.beans.Pedido;
import Pizzaria.source.beans.PedidoFimDeSemana;
import Pizzaria.source.beans.PedidoMeioDaSemana;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marciano
 */
@ManagedBean(name="PedidoBean", eager=true)
public class PedidoBean {    
    String nomeCliente, endereco, nomePizza, complemento;   
    Pedido pedido = new PedidoFimDeSemana();
    
    public String novoPedido(){                
        this.pedido.NovoPedido(nomeCliente, endereco, nomePizza, 0, complemento);        
        return "exibePedido?faces-redirect=true";      
    }  
    
    public Pedido getPedido() {
        return pedido;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }   

    public String getEndereco() {
        return endereco;
    }   

    public String getNomePizza() {
        return nomePizza;
    }    

    public String getComplemento() {
        return complemento;
    }

    public void setPedido(Pedido pedido) {
       this.pedido = pedido;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }   
}
