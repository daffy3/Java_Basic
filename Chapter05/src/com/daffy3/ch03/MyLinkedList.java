package com.daffy3.ch03;

import java.util.Objects;

public class MyLinkedList {

    int count;
    private MyListNode head;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    // 맨 앞에 삽입시킬 경우에는 head에 넣고,
    // 그렇지 않을 경우에는 연결을 끊고 삽입한다. prevNode 값을 알아야한다.
    public MyListNode addElement(String data) {
        MyListNode newNode;
        // 맨 앞에 삽입시킬 경우에는 head에 넣고,
        if (head == null) {
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);

            // 맨 마지막 노드를 찾는다.
            MyListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;

        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head;
        MyListNode prevNode = null; // 이전 노드
        MyListNode newNode = new MyListNode(data); // 추가할 노드

        if (position < 0 || position > count) {
            return null;
        }
        // 맨 앞에 넣을 경우에는
        if (position == 0) {
            newNode.next = head; // 삽입할 데이터 다음이 본래 헤더 값이 되고
            head = newNode; // 헤더 자리에 삽입할 데이터가 온다.
        } else {
            for (i = 0; i < position; i++) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = prevNode.next;
            prevNode = newNode;
        }
        count++;

        return newNode;
    }

    public MyListNode removeElement(int position) {
        int i;
        MyListNode tempNode = head;
        MyListNode prevNode = null;

        // 맨 앞의 것을 삭제할 때
        if (position == 0) {
            head = tempNode.next;
        } else {
            // 중간에서 값을 삭제할 때
            for (i = 0; i < position; i++) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
            Objects.requireNonNull(prevNode).next = tempNode.next;
        }
        count--;

        return tempNode;
    }

    public String getElement(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return "error";
        }

        if (position == 0) {  //맨 인 경우

            return head.getData();
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {  //맨 인 경우

            return head;
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll() {
        head = null;
        count = 0;

    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
