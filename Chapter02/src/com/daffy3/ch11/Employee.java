package com.daffy3.ch11;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    // 객체가 생성될 때, 초기화는 생성자에서 시켜준다.
    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
