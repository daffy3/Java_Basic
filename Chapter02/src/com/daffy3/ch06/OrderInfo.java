package com.daffy3.ch06;

public class OrderInfo {

    public String orderNumber;
    public String orderPhoneNumber;
    public String orderAddress;
    public String orderDate;
    public String orderTime;
    public String price;
    public String productId;


    public OrderInfo(String orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, String orderTime, String price, String productId) {
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.productId = productId;
    }

    public String showOrderInfo() {
        return "주문접수번호: " + orderNumber + "\n" + "주문핸드폰번호: " + orderPhoneNumber + "\n" + "주문 집 주소: " + orderAddress + "\n" + "주문 날짜: " + orderDate + "\n" + "주문 시간: " + orderTime + "\n" + "주문가격: " + price + "\n" + "메뉴번호: " + productId;
    }

}
