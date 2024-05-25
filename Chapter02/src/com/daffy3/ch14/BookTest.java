package com.daffy3.ch14;

public class BookTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        // for (int i = 0; i < library.length; i++) {
        //     System.out.println(library[i]); // [null, null, null, null, null]
        // }

        library[0] = new Book("태백산맥-1", "조정래");
        library[1] = new Book("태백산맥-2", "조정래");
        library[2] = new Book("태백산맥-3", "조정래");
        library[3] = new Book("태백산맥-4", "조정래");
        library[4] = new Book("태백산맥-5", "조정래");

        for (Book book : library) {
            System.out.println(book);
        }

        // ====================================================================================================

        // 객체 배열 복사하기
        // - System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열복사 메서드
        // - 얕은 복사
        // 객체주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정된다.
        // 즉, 두 배열이 같은 객체를 가리킨다.

    }

}
