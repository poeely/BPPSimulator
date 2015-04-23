/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bppsimulator;


public class Product {
    private int id;
    private int weight;
     
    public Product(int id, int w){
        this.id = id;
        this.weight = w;
    }
    
    public int getId(){
        return id;
    }
    
    public int getWeight(){
        return weight;
    }
}
