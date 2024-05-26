package com.daffy3.ch02;

// 03. 상속에서 클래스 생성과정과 형 변환
// 하위 클래스가 생성되는 과정
// - 하위 클래스를 생성하면, 상위 클래스가 먼저 생성된다.
// - new VipCustomer()를 호춣하면, Customer()가 먼저 호출된다.
// - 클래스가 상속받은 경우, 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출한다.

public class VipCustomer extends Customer {

    private String agentId;
    double salesRatio;

    public VipCustomer() {
        // 상위 클래스에서 외부 클래스는 접근 못하지만, 하위 클래스에서는 접근할 수 있도록
        // 본래 private customerGrade =====> protected customerGrade로 변경한다.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public String getAgentId() {
        return agentId;
    }
}
