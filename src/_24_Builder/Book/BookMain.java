package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .bookID(123)
                .title("제목")
                .author("저자")
                .isbn("1234567890")
                .build();
        System.out.println(book);
    }


}
