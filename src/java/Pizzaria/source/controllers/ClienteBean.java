/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.controllers;

import Pizzaria.source.beans.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Marciano
 */
@ManagedBean(name = "ClienteBean")
@RequestScoped
public class ClienteBean {
    Cliente cliente = Cliente.INSTANCE;
    
    public Cliente getCliente(){
        return cliente;
    }
}
