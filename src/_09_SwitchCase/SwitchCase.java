package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Switch
        // break를 만날 때까지 계속 실행

        // ranking => 1 - 전액 장학금
        // ranking => 2 - 반액 장학금
        // ranking => 3 - 소정의 상금
        // ranking => 그 이하 - 박수

        int ranking = 2;

        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("소정의 상금");
        } else {
            System.out.println("박수");
        }

        System.out.println("-".repeat(30));

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("소정의 상금");
                break;
            default: // 모든 case를 만족하지 않을 때
                System.out.println("박수");
        }

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2: // 2에서 멈추지 않고 바로 3으로 가서 출력 후 브레이크
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // 모든 case를 만족하지 않을 때
                System.out.println("박수");
        }

        System.out.println("-".repeat(30));

        int grade = 1;
        int price = 7000;
        // 1등 = 10,000
        // 2등 = 9000
        // 3등 = 8000

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(price);

        System.out.println("-".repeat(30));

        // 월을 입력받고(int)
        // 3,4,5월 => Spring 출력
        // 6,7,8월 => Summer 출력
        // 9,10,11월 => Autumn 출력
        // 12,1,2월 => Winter 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("유효하지 않은 월입니다.");
        }

        // 숫자 a를 입력 받고
        // 연산자 기호를 입력받고 (+, -, *, /)
        // 숫자 b를 입력 받는다.
        // switch case문을 이용해서 연산결과를 출력

        System.out.println("===숫자 계산기===");
        System.out.print("숫자 a를 입력하세요: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("연산자 기호(+, -, *, /)를 입력하세요: ");
        String operator = scanner.nextLine();
        System.out.print("숫자 b를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("\n=====결과값=====");
        switch (operator) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                System.out.println("a / b = " + (a / b));
                break;
            default:
                System.out.println("유효한 기호가 아닙니다.");
        }

        scanner.close();

    }
}
