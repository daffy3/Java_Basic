package com.daffy3.ch02;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer();

        customerLee.setCustomerId(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        // ====================================================================================================

        VipCustomer customerKim = new VipCustomer();
        customerKim.setCustomerId(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }

}
