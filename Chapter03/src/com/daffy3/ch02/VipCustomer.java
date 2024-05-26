package com.daffy3.ch02;

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
