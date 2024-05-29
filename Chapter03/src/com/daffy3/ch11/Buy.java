package com.daffy3.ch11;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("Buy Order");
    }

}
