package com.daffy3.ch04;

public class VipCustomer extends Customer {

    double salesRatio;
    private String agentId;

    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= price * salesRatio;

        return price;
    }

    public String getAgentId() {
        return agentId;
    }

}
