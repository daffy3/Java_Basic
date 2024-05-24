package com.daffy3.ch09;

public class Person {

    String name;
    int age;

    // Default Constructor
    public Person() {
        // 아무런 값이 들어오지 않았을 경우, 초기화를 해주고 싶을 때
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }

    public Person getPerson() {
        return this;
    }

    // ==================================================

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson(); // 이름없음,1

        System.out.println(person); // com.daffy3.ch09.Person@63961c42

        Person person2 = person.getPerson();
        System.out.println(person2); // com.daffy3.ch09.Person@63961c42
    }

}
