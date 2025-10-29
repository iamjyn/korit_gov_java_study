package _24_Builder.Book;

import _24_Builder.User.User;

/*
* 빌더 패턴 객체 생성
* build()시 title 또는 author가 비어 있으면
* => "title 필드 또는 author 필드가 비어있습니다." 출력 (객체는 생성)
* isbn(string isbn) 호출 시 13자리가 아니라면
* => "ISBN형식이 아닙니다." 출력 (null 값 유지)
* toString 오버라이드 해서 모든 필드 출력
* */
public class Book {
    private int bookID;
    private String title;
    private String author;
    private String isbn;

    private Book(Builder builder) {
        this.bookID = builder.bookID;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }

    public static class Builder {
        private int bookID;
        private String title;
        private String author;
        private String isbn;

        public Builder bookID(int bookID) {
            this.bookID = bookID;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isbn(String isbn) {
            if (isbn.length() != 13) {
                System.out.println("ISBN 형식이 아닙니다.");
            } else {
                this.isbn = isbn;
            }
            return this;
        }

        public Book build() {
            if ((title == null || title.isBlank()) || (author == null || author.isBlank())) {
                System.out.println("title 필드 또는 author 필드가 비어있습니다");
            }
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book(bookID=" + bookID + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ")";
    }
}
