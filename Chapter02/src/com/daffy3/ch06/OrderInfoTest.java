package com.daffy3.ch06;

public class OrderInfoTest {

    public static void main(String[] args) {

        OrderInfo order = new OrderInfo("2024052400001","010-1234-5678", "서울특별시 서초구 방배동", "20240524","10:01","35,000", "10010");
        System.out.println(order.showOrderInfo());

    }

}
