package _33_Exception;

/*
* AgeRestrictionException
* => 나이제한에 대한 예외 클래스*/

import java.util.Scanner;

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class SignupException {
    /*
    * signup 메소드(String username, int age)
    * => 가입조건 만 14세 이상
    * 이 조건에 만족하지 않으면 AgeRestrictionException 발생
    * 해당 예외는 호출한 곳에서 처리
    * 만약 예외가 발생하지 않는다면 "username님, 가입을 환영합니다." 출력
    *
    * main에서 예외처리를 해줌
    * 예외 발생시 "회원가입 실패: 이유~~" 출력
    * 예외 유무 상관없이 "회원가입 처리 종료" 출력
    * */
    public static void signup(String username, int age) throws AgeRestrictionException {
        if (age < 14) {
            throw new AgeRestrictionException("가입조건에 만족하지 않습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        try {
            signup(name, age);
            System.out.println(name + "님, 가입을 환영합니다.");
        } catch (AgeRestrictionException e) {
            System.out.println("로그인 실패: " + e.getMessage());
        } finally {
            System.out.println("회원가입 처리 종료");
        }
        scanner.close();
    }
}
