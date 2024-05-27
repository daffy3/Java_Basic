package com.daffy3.ch04;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // 일반고객
    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
