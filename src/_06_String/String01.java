package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "My name is GilDong Hong";

        System.out.println(s.length()); // 문자열의 길이
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        System.out.println(s.contains("name")); // 포함여부 - 결과값 boolean
        System.out.println(s.contains("age"));

        System.out.println(s.indexOf("name")); // 위치정보 (인덱스)
        System.out.println(s.indexOf("age")); // 해당 문자열이 없으면 -1 반환

        s = "I like music and movie and travel";
        System.out.println(s.lastIndexOf("and")); // 위치정보 (인덱스) - 여러 개 중 마지막 위치
        System.out.println(s.lastIndexOf("name")); // 해당 문자열이 없으면 -1 반환
        System.out.println(s.startsWith("I like")); // 해당 문자열로 시작하냐?
        System.out.println(s.endsWith("travel")); // 해당 문자열로 끝나냐?



    }
}
