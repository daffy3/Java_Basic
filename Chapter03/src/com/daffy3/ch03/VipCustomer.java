package com.daffy3.ch03;

// 03. 상속에서 클래스 생성과정과 형 변환
// 하위 클래스가 생성되는 과정
// - 하위 클래스를 생성하면, 상위 클래스가 먼저 생성된다.
// - new VipCustomer()를 호춣하면, Customer()가 먼저 호출된다.
// - 클래스가 상속받은 경우, 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출한다.

// 상속에서 인스턴스 메모리의 상태
// - 항상 상위 클래스의 인스턴스가 먼저 생성되고, 하위 클래스의 인스턴스가 생성된다.
// - private 변수도 생성된다. 단, 접근을 하지 못할 뿐

public class VipCustomer extends Customer {

    private String agentId;
    double salesRatio;

    public VipCustomer(int customerId, String customerName) {
        // super 키워드
        // - 하위 클래스에서 가지는 상위 클래스에 대한 참조값
        // - super()는 상위 클래스의 기본 생성자를 호출한다.
        // - 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출된다. (이때, 반드시 상위 클래스의 기본 생성자가 존재해야한다.)
        // - 상위 클래스의 기본 생성자가 없는 경우 (다른 생성자가 있는 경우) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출한다.
        // - super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있다.

        super(customerId, customerName);
        // 상위 클래스에서 외부 클래스는 접근 못하지만, 하위 클래스에서는 접근할 수 있도록
        // 본래 private customerGrade =====> protected customerGrade로 변경한다.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VipCustomer 생성자 호출");
    }

    public String getAgentId() {
        return agentId;
    }
}
