/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.controllers;

import Pizzaria.source.beans.Cliente;
import Pizzaria.source.beans.Complemento;
import Pizzaria.source.beans.Pedido;
import Pizzaria.source.beans.PedidoFimDeSemana;
import Pizzaria.source.beans.PedidoMeioDaSemana;
import Pizzaria.source.beans.Pizza;
import Pizzaria.source.beans.Produto;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marciano
 */
@ManagedBean(name="PedidoBean", eager=true)
public class PedidoBean {    
    // declarando atributos do controller (semelhante ao servlet)
    String nomeCliente, endereco, nomePizza, complemento;  
    Pedido pedido = new PedidoFimDeSemana();
    Produto produto = Pizza.INSTANCE;
    Cliente cliente = Cliente.INSTANCE;
    
    public PedidoBean(){ // construtor do bean
    }
    
    public String novoPedido(){ // chamada do template method
        System.out.println("Chamou o metodo NovoPedido");
        this.pedido.NovoPedido(nomeCliente, endereco, nomePizza, complemento);               
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }    
    
}