package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 = Do While
        // 일단 한번 실행 후 조건 검사
        // => 조건에 상관없이 무조건 최초 1회는 실행
        // while은 조건 검사 후 실행

        /*
        * do {
        *   반복할 코드 - 최초 한 번은 실행
        * } while (조건);
        * */

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 5);

        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("=== 메뉴 ===");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("0. 종료");
//            System.out.print("선택: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("주문을 합니다.");
//                    break;
//                case 2:
//                    System.out.println("취소를 합니다.");
//                    break;
//                case 0:
//                    System.out.println("종료합니다.");
//                    break;
//                default:
//                    System.out.println("올바른 번호를 입력하세요.");
//            }
//        } while (choice != 0);

        // 1~n까지 합(do while)

//        int i = 1;
//        int sum = 0;
//
//        System.out.print("숫자를 입력하세요: ");
//        int inputNum = scanner.nextInt();;
//        do {
//            sum += i;
//            i++;
//        } while (i <= inputNum);
//
//        System.out.println("합계: " + sum);


        // 숫자 맞추기 게임
        int answer = (int) (Math.random() * 100) + 1;

        // 숫자를 입력받아서 정답을 맞추기
        // 업 다운 출력
        // 시도한 횟수를 나중에 맞췄을 때 같이 출력

        int count = 0;
        int inputNum;

        do {
            System.out.print("숫자를 입력하세요 (1~100): ");
            inputNum = scanner.nextInt();
            count++;

            if (inputNum < answer) {
                System.out.println("\nup!");
            } else if (inputNum > answer) {
                System.out.println("\ndown!");
            } else {
                System.out.println("\n정답입니다!\n시도한 횟수: " + count);
            }
        } while (inputNum != answer);

    }
}
