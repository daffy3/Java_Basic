package com.daffy3.ch05;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student(int studentNumber, String studentName, int grade) {
        // 멤버변수 초기화
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;

        System.out.println("Student 생성");
    }

    public String showStudentInfo() {
        // int i; ===> 지역변수는 자동으로 초기화되지 않는다.
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }

}
