package _08_If;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        // 조건문 => if문
        /*
        if (조건문) {
            해당조건이 참일 때 실행될 코드
        }
        */
        int height = 100;
        // 키가 120 이상이면 탑승 가능 출력
        if (height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 120 이상이면서 어린이인 경우만 탑승 가능
        boolean isKid = true;
        if (height >= 120 && isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 120 이상이거나 어린이인 경우 탑승 가능
        if (height >= 120 || isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        System.out.println("====================");

        // 1. 3의 배수인지 판단
        int num = 12;
        // 3의 배수이면 3의 배수입니다. 출력
        if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("아닙니다.");
        }

        // 2. 절댓값 출력
        int num2 = -12;
        // 절댓값을 출력하시오
        if (num2 > 0) {
            System.out.println(num2);
        } else {
            System.out.println(num2 * -1);
        }

        // 3. 최댓값 출력
        int num3 = 12;
        int num4 = 8;
        // 최댓값을 출력하시오
        if (num3 > num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }

        System.out.println("====================");

        // 4. 아이디 비밀번호 확인
        String userId = "myid1234";
        String userPw = "qwer1234";
        // 사용자에게 아이디 비밀번호를 입력받아 일치하면
        // 로그인 확인 출력
        // 아이디가 틀리면 아이디가 틀렸습니다.
        // 비밀번호가 틀리면 비밀번호가 틀렸습니다.

        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String pw = scanner.nextLine();

        if (userId.equals(id)) {
            // 아이디 맞을 때
            if (userPw.equals(pw)) {
                // 비밀번호 맞을 때
                System.out.println("\n로그인 확인");
            } else {
                // 비밀번호가 틀릴 때
                System.out.println("\n비밀번호가 틀렸습니다.");
            }
        } else {
            // 아이디가 틀릴 때
            System.out.println("\n아이디가 틀렸습니다.");
        }


    }
}
