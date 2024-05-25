package com.daffy3.ch12;

public class CompanyTest {

    public static void main(String[] args) {
        // static 인 경우에는, Class 이름으로 사용하여 접근해야한다.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1); // com.daffy3.ch12.Company@a09ee92
        System.out.println(company2); // com.daffy3.ch12.Company@a09ee92
    }

}
