package com.daffy3.ch14;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5]; // 복사된 배열

        library[0] = new Book("태백산맥-1", "조정래");
        library[1] = new Book("태백산맥-2", "조정래");
        library[2] = new Book("태백산맥-3", "조정래");
        library[3] = new Book("태백산맥-4", "조정래");
        library[4] = new Book("태백산맥-5", "조정래");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        // ====================================================================================================

        System.out.println("\t");
        System.out.println("========== copyLibrary ==========");
        System.out.println("\t");

        // ====================================================================================================

        System.arraycopy(library, 0, copyLibrary, 0, 5); // =====> 얕은 복사
        library[0].setTitle("소백산맥-1");
        library[0].setAuthor("박완서");

        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

        // ====================================================================================================

        System.out.println("\t");
        System.out.println("========== deep clone copyLibrary ==========");
        System.out.println("\t");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }

}
