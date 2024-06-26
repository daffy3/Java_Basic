package com.daffy3.ch05;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 네 발로 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리는 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 펴고 다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(human);
        test.moveAnimal(tiger);
        test.moveAnimal(eagle);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(human);
        animalList.add(tiger);
        animalList.add(eagle);

        for (Animal animal : animalList) {
            animal.move();
        }

    }

    public void moveAnimal(Animal animal) {
        animal.move();
        // Animal 타입에서는 Human 가지고 있는 readBook 이나 Tiger가 가지고 있는 hunting은 호출할 수 없다.
        // 위 설명을 위해서는 다운캐스팅을 해아한다.
    }
}
