/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria.source.beans;

/**
 *
 * @author carlysson
 */
public class PizzaDecorator extends Pizza{
    protected Pizza pizza;
    
    PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public int getPrecoPizza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
