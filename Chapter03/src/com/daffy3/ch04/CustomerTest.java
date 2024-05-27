package com.daffy3.ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        // ====================================================================================================

        VipCustomer customerKim = new VipCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);

        System.out.println(customerKim.showCustomerInfo() + price);

        // ====================================================================================================

        Customer vc = new VipCustomer(11234,"noName");
        vc.calcPrice(1000);
        System.out.println(vc.calcPrice(1000)); // 900

        // 형 변환과 오버라이딩 메서드 호출
        // Customer vc = new VipCustomer();
        // vc 변수의 타입은 Customer지만, 인스턴스의 타입은 VipCustomer이다.
        // 자바에서는 항상 인스턴스의 메서드가 호출된다. ===> 가상 메서드의 원리
        // 자바의 모든 메서드는 가상 메서드이다.

    }

}
