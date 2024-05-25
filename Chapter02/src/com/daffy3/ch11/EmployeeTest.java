package com.daffy3.ch11;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.serialNum); // 1000
        // 위 코드에서 employeeLee.serialNum 아래 노란 밑줄이 생기는 이유는
        // serialNum는 static 변수이기 때문에 이미 메모리에 올라와 있을 때 만들어졌기 때문에
        // 직접 클래스 이름으로 참조해서 사용한다. =====> Employee.serialNum
        System.out.println(Employee.serialNum); // 1000

        // ====================================================================================================

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        // employeeKim.serialNum++;
        // System.out.println(employeeLee.serialNum); // 1001
        // System.out.println(employeeKim.serialNum); // 1001
        // 위의 값을 보면 serialNum 모두 증가된 걸 확인할 수 있는데, 각각의 인스턴스가 하나의 메모리를 참조하고 있다는 걸 알 수 있다.

        // ====================================================================================================

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");

    }

}
