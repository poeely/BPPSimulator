/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bppsimulator;


public class Order implements Comparable<Order> {
    private int capacity;
    private int actualCapacity;
    private int usedCapacity;

    public Order(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public int getCapacity() {
        return (actualCapacity - usedCapacity);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }
