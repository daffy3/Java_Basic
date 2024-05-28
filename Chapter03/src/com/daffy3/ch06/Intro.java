package com.daffy3.ch06;

import com.daffy3.ch05.Customer;
import com.daffy3.ch05.VipCustomer;

public class Intro {
    // 08. 다운 캐스팅과 instanof
    // - 업 캐스팅된 클래스를 다시 원래의 타입으로 형 변환
    // - 하위 클래스로의 형 변환은 명시적으로 해야한다.
    Customer vc = new VipCustomer(10010, "9Diin"); // ===> 묵시적
    VipCustomer vCustomer = (VipCustomer) vc; // ===> 명시적
}
