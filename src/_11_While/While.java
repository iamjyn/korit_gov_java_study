package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // 반복문 - While
        // 조건이 참일 경우 계속 반복
        // for문과 차이
        // for문은 횟수 중심, while 조건 중심
        /*
        * while (boolean 조건) {
        *   반복할 코드
        * }
        * */

        // 1~5까지 출력
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//            i++; // 조건을 변경하기 위한 코드 필요
//        }
//
//        i = 10;
//        while (i >= 1) {
//            System.out.println(i);
//            i--;
//        }
//

        // while 짝수만 출력 (1~10)
//        i = 1;
//        while (i <= 10) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        // 점수를 입력한다 (0~100)
//        while (flag) {
//            System.out.print("점수를 입력하세요: ");
//            int score = scanner.nextInt();
//            if (0 < score && score <= 100) {
//                System.out.println("점수: " + score);
//                break;
//            } else {
//                System.out.println("다시 입력하세요\n");
//            }
//        }

//        int menu;
//        while (true) {
//            System.out.println("메뉴를 선택하세요.");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("3. 재주문하기");
//            System.out.print("메뉴를 고르세요: ");
//            menu = scanner.nextInt();
//
//            switch (menu) {
//                case 1:
//                    System.out.println("주문하기 메뉴");
//                    break;
//                case 2:
//                    System.out.println("취소하기");
//                    break;
//                case 3:
//                    System.out.println("재주문하기");
//                    break;
//                default:
//                    System.out.println("다시 입력해주세요.");
//                    continue;
//            }
//            break;
//        }

        // 문제1) 1부터 100까지 누적합
//        int num = 1;
//        int sum = 0;
//        while (num <= 100) {
//            sum += num;
//            num++;
//        }
//        System.out.println("합계: " + sum);

        // 문제2) 1번부터 100까지 식당 웨이팅
        // 이때 1번부터 차례대로 입장 => **번 손님 입장! 출력
        // 10번 손님이 입장할 때 한정메뉴가 솔드 아웃
        // 솔드 아웃 되었기 때문에 가게 문닫음 => 영업종료 출력
//        int guest = 1;
//        int max = 10;
//        while (guest <= 100) {
//            System.out.println(guest + "번 손님 입장!");
//            if (guest == max) {
//                System.out.println("솔드 아웃!");
//                break;
//            }
//            guest++;
//        }
//        System.out.println("영업종료");

        // 문제2) for문으로
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i + "번 손님 입장!");
//            if (i == max) {
//                System.out.println("솔드 아웃!");
//                break;
//            }
//        }
//        System.out.println("영업종료");

        // 문제3) 1번부터 50번까지 웨이팅
        // 메뉴가 20개까지만 한정판매 => 솔드아웃 영업종료 출력
        // 이때 14번이 노쇼 => *번 노쇼 발생! 출력
        // 이것을 while문으로
        int guest = 1;
        int noShow = 14;
        int max = 20;
        int sold = 0;

//        while (guest <= 50) {
//            System.out.println(guest + "번 손님 입장!");
//
//            if (guest == noShow) {
//                System.out.println(guest + "번 노쇼 발생!");
//            } else {
//                sold++;
//            }
//
//            if (sold == max) {
//                System.out.println("솔드아웃!");
//                break;
//            }
//            guest++;
//        }
//        System.out.println("영업종료");

        // 문제3) for문으로
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 입장!");

            if (i == noShow) {
                System.out.println(noShow + "번 노쇼 발생!");
            } else {
                sold++;
            }
            if (sold == max) {
                System.out.println("솔드아웃!");
                break;
            }
        }
        System.out.println("영업종료");

    }
}
