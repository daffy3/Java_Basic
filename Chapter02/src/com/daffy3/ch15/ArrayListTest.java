package com.daffy3.ch15;

import com.daffy3.ch14.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥-1", "조정래"));
        library.add(new Book("태백산맥-2", "조정래"));
        library.add(new Book("태백산맥-3", "조정래"));
        library.add(new Book("태백산맥-4", "조정래"));
        library.add(new Book("태백산맥-5", "조정래"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }

    }
}
