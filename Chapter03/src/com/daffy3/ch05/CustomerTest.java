package com.daffy3.ch05;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(10010, "Tomas");
        Customer customerJ = new Customer(20020, "James");
        Customer customerE = new GoldCustomer(30030, "Edward");
        Customer customerP = new GoldCustomer(40040, "Percy");
        Customer customerK = new VipCustomer(50050, "Kim");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 보너스포인트는 " + customer.bonusPoint + "점 입니다.");
        }
    }

}
