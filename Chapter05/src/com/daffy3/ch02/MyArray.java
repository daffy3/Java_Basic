package com.daffy3.ch02;

public class MyArray {
    public static final int ERROR_NUM = -999999999;
    public int ARRAY_SIZE;
    int[] intArr;
    int count;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("Not Enough Memory");
            return;
        }
        intArr[count++] = num; // 값을 할당한 후 count 값이 증가
    }

    public void insertElement(int position, int num) {
        // 배열에 요소를 삽입할 때, 맨 뒤의 값부터 한 칸씩 뒤로 밀어야한다.
        int i;

        if (position < 0 || position > count) {
            return;
        }
        if (count >= ARRAY_SIZE) {
            System.out.println("데이터가 꽉 차 있습니다.");
            return;
        }

        for (i = count - 1; i >= position; i--) {
            intArr[i + 1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {
        int ret = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("배열이 비었습니다.");
            return ret;
        }

        if (position < 0 || position > count - 1) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
            return ret;
        }
        ret = intArr[position];

        for (int i = position; i < count - 1; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;

        return ret;

    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getElement(int position) {
        if (position < 0 || position > count - 1) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }

    public void removeAll() {
        for (int i = 0; i < count; i++) {
            intArr[i] = 0;
        }
        count = 0;
    }

}
