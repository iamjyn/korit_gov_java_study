package _33_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidateException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("정상적인 나이입니다." + age);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다. 정수를 입력해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("검증 종료");
        }
    }

    public static void validateAge(int age) {
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("유효하지 않은 나이입니다. (입력값: " + age + ")");
        }
    }
}
