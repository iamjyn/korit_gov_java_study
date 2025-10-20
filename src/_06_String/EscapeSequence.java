package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'

        // \n => 개행
        System.out.println("집에\n너무\n가고싶어요");

        // \t => 공백 4칸
        System.out.println("1.\t페이커");

        // \\ 역슬래쉬를 문자열에 포함시키고 싶을 때
        // "C:\Program Files\java"
        System.out.println("C:\\Program Files\\java");

        // \" 큰 따옴표 | \' 작은 따옴표
        // 손흥민의 팀은 "LA FC"이다.
        System.out.println("손흥민의 팀은 \"LA FC\"이다.");
        System.out.println("손흥민의 팀은 \'LA FC\'이다.");

        char c = 'A';
        c = '\'';

        String id = "998877-1234567";
        System.out.println(id.substring(0, 8));
        System.out.println(id.substring(0, id.indexOf("-") + 2));

    }
}
