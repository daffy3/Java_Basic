package com.daffy3.ch11;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
    }

    public void hello() {
        System.out.println("Hello!");
    }
}
