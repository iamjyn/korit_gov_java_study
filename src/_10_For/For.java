package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        /*
        * for (선언부; 조건부; 증감부) {
        *   반복될 코드
        * }
        * */

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        // 짝수
//        for (int i = 0; i < 50; i+= 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        // 1부터 100까지 다 더한 합을 구하시오
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            System.out.println("sum: " + sum);
//        }
//        System.out.println(sum);

        // 문제
        // 1~100까지 중에 짝수만 더한 총합을 구하시오
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            System.out.println("sum: " + sum);
//        }
//        System.out.println(sum);
//
//        int sum2 = 0;
//        for (int i = 0; i <= 100; i+= 2) {
//            sum2 += i;
//            System.out.println("sum: " + sum2);
//        }
//        System.out.println(sum2);

        // 구구단 출력하기 (한단만)
        // 특정 단을 입력받아서 1~9단까지

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요: ");
//        int num = scanner.nextInt();
//        System.out.println("===" + num + "단===");
//        for (int i = 1; i <= 9; i++) {
//            int result = num * i;
//            System.out.println((num + " x " + i) + " = " + result);
//        }

        // 구구단 출력하기 (전체)
//        int sum = 0;
//        for (int i = 1; i <= 9; i++) {
//            System.out.println("===" + i + "단===");
//            for (int j = 1; j <= 9; j++) {
//                sum = i * j;
//                System.out.println((i + " x " + j) + " = " + sum);
//            }
//        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("*".repeat(i));
//        }
//
//        for (int i = 5; i >= 1; i--) {
//            System.out.println("*".repeat(i));
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // break, continue
//        for (int i = 1; i < 10; i++) {
//            if (i == 5) {
//                System.out.println("5입니다");
//                continue;
//            }
//            System.out.println(i);
//        }

        // 1~50까지 수 중에서 3의 배수 빼고 출력하기
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0) {
//                System.out.println(" ");
//                continue;
//            }
//            System.out.println(i);
//        }

        // 1부터 계속 합계를 구하되 합계가 200이 넘어가면 스탑
        // 마지막은 최종 합과 마지막으로 더한 수를 출력
//        int sum = 0;
//        for (int i = 1; ; i++) {
//            sum += i;
//            if (sum >= 200) {
//                System.out.println("마지막 숫자: " + i);
//                System.out.println("최종합계: " + sum);
//                break;
//            }
//        }

        // 1부터 100까지 중에서 3의 배수와 5의 배수의 갯수를 각각 출력
//        int num3 = 0;
//        int num5 = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                num3 += 1;
//            }
//            if (i % 5 == 0) {
//                num5 += 1;
//            }
//        }
//        System.out.println("3의 배수: " + num3);
//        System.out.println("5의 배수: " + num5);

        // 정수 5개를 입력받고 입력받은 수 중 가장 큰 값 출력
        // 1~100 사이 / 아니라면 "범위를 벗어났습니다" 출력 후 스탑

        Scanner scanner = new Scanner(System.in);

//        System.out.print("숫자 5개를 입력하세요(1~100): 1 > ");
//        int num1 = scanner.nextInt();
//        scanner.nextLine();
//        if (num1 > 100 && num1 < 0) {
//            System.out.println("범위를 벗어났습니다");
//            return;
//        }
//
//        System.out.print("숫자 5개를 입력하세요(1~100): 2 > ");
//        int num2 = scanner.nextInt();
//        scanner.nextLine();
//        if (num2 > 100 && num2 < 0) {
//            System.out.println("범위를 벗어났습니다");
//            return;
//        }
//
//        System.out.print("숫자 5개를 입력하세요(1~100): 3 > ");
//        int num3 = scanner.nextInt();
//        scanner.nextLine();
//        if (num3 > 100 && num3 < 0) {
//            System.out.println("범위를 벗어났습니다");
//            return;
//        }
//
//        System.out.print("숫자 5개를 입력하세요(1~100): 4 > ");
//        int num4 = scanner.nextInt();
//        scanner.nextLine();
//        if (num4 > 100 && num4 < 0) {
//            System.out.println("범위를 벗어났습니다");
//            return;
//        }
//
//        System.out.print("숫자 5개를 입력하세요(1~100): 5 > ");
//        int num5 = scanner.nextInt();
//        scanner.nextLine();
//        if (num5 > 100 && num5 < 0) {
//            System.out.println("범위를 벗어났습니다");
//            return;
//        }

//        System.out.println("숫자 5개를 입력하세요(1~100): >");
//
//        int maxNum = 0;
//        for (int i = 1; i <= 5; i++) {
//            int inputNum = scanner.nextInt();
//            if (inputNum > 100 || inputNum < 0) {
//                System.out.println("범위를 벗어났습니다.");
//                break;
//            }
//            if (maxNum < inputNum) {
//                maxNum = inputNum;
//            }
//        }
//        System.out.println("가장 큰 수: " + maxNum);

        // 팩토리얼 구하기
        // 숫자를 입력받아 팩토리얼 구하기
        // 단 1~10까지만 입력받기

//        System.out.println("===팩토리얼 구하기===");
//        System.out.print("숫자를 입력하세요(1~10): ");
//        int num = scanner.nextInt();
//
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        System.out.println("팩토리얼: " + fact);

        // 1~50 까지 반복 (3,6,9) 박수 출력
        // (5) 으악 출력

        int num3 = 3;
        int num6 = 6;
        int num9 = 9;
        for (int i = 1; i <= 50; i++) {
            if (num3 == i) {
                num3 += 10;
                System.out.println("박수");
                continue;
            }
            if (num6 == i) {
                num6 += 10;
                System.out.println("박수");
                continue;
            }
            if (num9 == i) {
                num9 += 10;
                System.out.println("박수");
                continue;
            }
            if (i >= 30 && i < 40) {
                System.out.println("박수");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("으악");
                continue;
            }
            System.out.println(i);
        }






    }
}
