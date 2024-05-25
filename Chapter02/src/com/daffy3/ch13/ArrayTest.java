package com.daffy3.ch13;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10]; // 배열의 길이가 10이며, 요소는 int 배열
        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
            System.out.println(arr[i]);
        }

        for (int num : arr) {
            total += num;
        }
        System.out.println(total); // 55

    }

}
