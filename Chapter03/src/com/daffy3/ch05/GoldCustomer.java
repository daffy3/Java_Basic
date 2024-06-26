package com.daffy3.ch05;

public class GoldCustomer extends Customer {
    double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
