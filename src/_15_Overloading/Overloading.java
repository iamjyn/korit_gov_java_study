package _15_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double number) {
        return (int) (number * number);
    }

    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    public static void printInfo(String name, int age, String email) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // : 같은 이름의 메소드를 여러 개 선언하는 것
        // 1. 전달 값(파라미터)의 타입이 달라야 한다.
        // 2. 또는 갯수가 달라야 한다.
        // 3. 대신에 반환형은 같아도 된다.

        System.out.println(getPower(3));
        System.out.println(getPower(3.14));

        // printInfo()
        // 문자열 이름만 전달해서 => 이름출력
        // 문자열 이름과 정수 나이 전달 => 이름, 나이 출력
        // 문자열 이름과 정수 나이, 문자열 이메일 전달 => 이름, 나이, email 출력
        printInfo("홍길동");
        printInfo("홍길동", 22);
        printInfo("홍길동", 22, "abc@naver.com");


    }
}
