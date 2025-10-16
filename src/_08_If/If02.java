package _08_If;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        /*
        * if (조건1) {
        *       (조건 1이 참일 때 실행되는 코드)
        * } else if (조건 2) {
        *       (조건 2이 참일 때 실행되는 코드)
        * } else {
        *       (조건 1과 조건 2가 모두 거짓일 때 실행되는 코드)
        * }
        * */

        int avgScore = 77;
        /*
        * 90점 이상 A
        * 80점 이상 B
        * 70점 이상 C
        * 나머지 D
        * */
        if (avgScore >= 90) {
            System.out.println("학점: A");
        } else if (avgScore >= 80) {
            System.out.println("학점: B");
        } else if (avgScore >= 70) {
            System.out.println("학점: C");
        } else {
            System.out.println("학점: D");
        }

        // 사분면 (좌표평면)
        // 일사분면 x, y
        // 이사분면 -x, y
        // 삼사분면 -x, -y
        // 사사분면 x, -y
        // x와 y를 입력 받으세요
        // 입력했을 때 몇 사분면에 존재하는지 출력하시오

        System.out.println("=======================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        System.out.print("x: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("y: ");
        int y = scanner.nextInt();
        scanner.nextLine();

        if (x > 0 && y > 0) {
            System.out.println("제1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("제2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("제3삼사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("제4사분면");
        }


    }
}
