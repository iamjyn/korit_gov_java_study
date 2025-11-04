package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

/*
* Book 객체 => Json 문자열
* Json => Map
* Map => pretty json
* Json => Book 객체
* */

@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Book book = new Book("978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판");
        String bookJson = gson.toJson(book);
        System.out.println("[Book => Json]");
        System.out.println(bookJson);
        System.out.println();

        Map<String, String> map = gson.fromJson(bookJson, Map.class);
        System.out.println("[Json => Map]");
        System.out.println(map);
        System.out.println();

        JsonObject bookInfo = new JsonObject();
        String mapJson = gsonBuilder.toJson(map);
        System.out.println("[Map => pretty json]");
        System.out.println(mapJson);
        System.out.println();

        Book book2 = gson.fromJson(mapJson, Book.class);
        System.out.println("[Json => Book]");
        System.out.println(book2);
    }
}
