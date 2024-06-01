package com.daffy3.ch04;

import com.daffy3.ch02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    // Stack에 쌓인 데이터를 꺼낼 경우
    public int pop() {
        // 배열 내 요소가 없을 경우
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek() {
        // 배열 내 요소가 없을 경우
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    // 배열은 사이즈가 정해져 있기 때문에, 배열이 꽉 찼을 경우
    public boolean isFull() {
        return top == arrayStack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
