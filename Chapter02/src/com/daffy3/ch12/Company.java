package com.daffy3.ch12;

public class Company {

    private static Company instance = new Company();

    // 생성자를 만들어버리면, 컴파일러가 자동으로 생성자를 만들지 않는다.
    private Company() {
    }

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

}
