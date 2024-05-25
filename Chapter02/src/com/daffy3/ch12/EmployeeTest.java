package com.daffy3.ch12;

public class EmployeeTest {

    // static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다.
    // - static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출될 수 있다.
    // - 인스턴스 생성 전에 호출될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없다.

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        Employee employeeKim = new Employee();

        employeeLee.setEmployeeName("이순신");
        employeeKim.setEmployeeName("김유신");

        System.out.println(Employee.getSerialNum()); // 1000

        // ====================================================================================================

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");

    }

}
