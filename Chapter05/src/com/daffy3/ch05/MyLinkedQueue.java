package com.daffy3.ch05;

import com.daffy3.ch03.MyLinkedList;
import com.daffy3.ch03.MyListNode;

interface Queue {
    void enQueue(String data);

    String deQueue();

    void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {
        MyListNode newNode;

        // 비어있는 큐에 맨 앞에 넣을 경우
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            // 비어있는 큐에 맨 뒤에 넣는다.
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added!!");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        }
        String data = front.getData();
        front = front.next;

        // 마지막 항목일 때
        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {

    }
}
