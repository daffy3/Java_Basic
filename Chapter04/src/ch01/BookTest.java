package ch01;

class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만헤세");
        System.out.println(book); // ch01.Book@a09ee92
        String str = "Test";
        System.out.println(str); // Test
        System.out.println(str.toString()); // Test

    }

}
