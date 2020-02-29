package com.daasworld.demo.domain;

import java.util.ArrayList;

public class Order {
    private static int nextOrderId = 0;

    private int id;
    private Customer customer;
    private ArrayList<LineItem> lineItems = new ArrayList<>();
    private int total=0;

    public Order(){
        this.id = nextOrderId;
        nextOrderId++;
    }

    public Order(Customer c){
        this();
        setCustomer(c);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<LineItem> getLineItems() {
        // make sure to return a copy
        ArrayList<LineItem> copy = new ArrayList<>();
        copy.addAll(lineItems);
        return copy;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = new ArrayList<>();
        this.lineItems.addAll(lineItems);
    }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", lineItems=" + lineItems +
                ", total=" + total +
                '}';
    }
}
