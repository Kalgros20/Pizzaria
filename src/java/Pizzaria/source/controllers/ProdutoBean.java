/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.controllers;

import Pizzaria.source.beans.Pizza;
import Pizzaria.source.beans.Produto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Marciano
 */
@ManagedBean(name = "ProdutoBean")
@RequestScoped
public class ProdutoBean {
    Produto produto = Pizza.INSTANCE;
    
    public Produto getProduto(){
        return produto;
    }
}
