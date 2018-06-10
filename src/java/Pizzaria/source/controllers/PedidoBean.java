/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.controllers;

import Pizzaria.source.beans.Cliente;
import Pizzaria.source.beans.Pedido;
import Pizzaria.source.beans.PedidoFimDaSemana;
import Pizzaria.source.beans.PedidoMeioDaSemana;
import Pizzaria.source.beans.Pizza;
import Pizzaria.source.beans.Produto;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;



/**
 *
 * @author Marciano
 */
@ManagedBean(name="PedidoBean", eager=true)
@RequestScoped
public class PedidoBean {    
    
    String nomeCliente, endereco, nomePizza, valor;   
    private String[] complemento;
    private Pedido pedido = new PedidoFimDaSemana();
    private Produto produto;
    private Pizza pizza = new Pizza();
    private Cliente cliente = Cliente.INSTANCE;    
        
    public Pedido getPedidos(){   // exibe Pedido via ajax (Contem erros)     
        Pedido pedidos = new PedidoFimDaSemana();
        pedidos.NovoPedido(nomeCliente, endereco, nomePizza, complemento);
        return pedidos;
    }     
   
    public void show(){ // método teste de exibição 
        this.pedido = new PedidoFimDaSemana();
        this.pedido.NovoPedido(nomeCliente, endereco, nomePizza, complemento);   // chamada do template method     
        System.out.println("\nCliente: " + pedido.cliente.INSTANCE.getNome() + 
                "\nEndereço da entrega: " + pedido.cliente.INSTANCE.getEndereco());
        System.out.println("\nProdutos: " + pedido.produto.getNome() + 
                "\nValor a pagar: " + pedido.produto.getPreco());        
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

    public String[] getComplemento() {
        return complemento;
    }

    public void setComplemento(String[] complemento) {
        this.complemento = complemento;
    }   

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    
}