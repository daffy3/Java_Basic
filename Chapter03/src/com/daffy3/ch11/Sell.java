package com.daffy3.ch11;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("Sell Order!!");
    }

}
