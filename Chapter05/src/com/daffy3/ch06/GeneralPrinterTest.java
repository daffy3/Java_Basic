package com.daffy3.ch06;

public class GeneralPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        // GenericPrinter<실제 어떤 타입 / 어떤 자료형을 쓸 건지 지정>
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        powderPrinter.setMaterial(powder);
        plasticPrinter.setMaterial(plastic);

        Powder p1 = powderPrinter.getMaterial();
        Plastic p2 = plasticPrinter.getMaterial();

        System.out.println(powderPrinter); // 재료는 파우더 입니다.
        System.out.println(plasticPrinter); // 재료는 플라스틱 입니다.

    }

}
