package com.daffy3.ch11;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = new Customer();
        buyer.buy();
        buyer.order();

        Sell seller = new Customer();
        seller.sell();
        seller.order(); // 재정의된 order가 호출

    }

}
