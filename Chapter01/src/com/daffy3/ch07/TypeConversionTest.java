package com.daffy3.ch07;

public class TypeConversionTest {

    public static void main(String[] args) {

        int iNum = 255;
        byte bNum = iNum; // 타입매칭오류

        System.out.println(iNum);

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum);

        System.out.println(iNum1); // 1
        System.out.println(iNum2); // 2
    }

}
