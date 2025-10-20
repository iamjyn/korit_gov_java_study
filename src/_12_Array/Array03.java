package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 정렬
//        int[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};
        Integer[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};
        System.out.println(Arrays.toString(nums));

        // sort()
        Arrays.sort(nums); // 오름차순
        System.out.println(Arrays.toString(nums));

        // for문으로 오름차순을 역순화
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(nums));

        // 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        // Comparator.reverseOrder()는 Integer 여야 한다.
        System.out.println(Arrays.toString(nums));

        /*
         * int와 Integer는 같지 않다.
         * 같은 정수 타입을 사용하긴 하나 int는 primitive type 즉 원시적인 자료형
         * Integer는 클래스로 이루어져 있으며 Wrapper Class
         * 같은 정수지만 int는 연산만 가능한 반면 Integer 다양한 기능을 사용할 수 있다.
         * double - Double
         * float - Float
         * long - Long 등등
         * */

        int intNum = 3;
        Integer integerNum = 3;

        // 평균 구하기
        int sum = 0; // 총합을 저장하기 위한 변수
        float average = 0F; // 평균을 저장하기 위한 변수
        int[] scores = {100, 88, 100, 100, 90};

//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        average = (float) sum / scores.length;
//        System.out.println("총합: " + sum);
//        System.out.println("평균: " + average);

        for (int score : scores) {
            sum += score;
        }
        average = (float) sum / scores.length;
        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);

        // 최대 최솟값 구하기
        int[] score2 = {72, 88, 91, 33, 100, 55, 95};
        int max = score2[0]; // 배열의 첫 번째 값으로 최대값을 초기화
        int min = score2[0]; // 배열의 첫 번째 값으로 최솟값을 초기화

//        for (int i = 1; i < score2.length; i++) {
//            if (score2[i] > max) {
//                max = score2[i];
//            } else if (score2[i] < min) {
//                min = score2[i];
//            }
//        }
//        System.out.println("최대값: " + max);
//        System.out.println("최솟값: " + min);

        for (int score : score2) {
            if (score > max) {
                max = score;
            } else if (score < min) {
                min = score;
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최솟값: " + min);

        // 요일 출력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        // 1~7까지 숫자를 입력받아서 요일을 출력하도록
        // 범위를 벗어나면 "잘못 입력 하셨습니다." 출력
        Scanner scanner = new Scanner(System.in);

//        System.out.print("숫자를 입력하세요: ");
//        int num = scanner.nextInt();

//        System.out.print("숫자를 입력하세요(1~7): ");
//        int num = scanner.nextInt();
//
//        if (num >= 1 && num <= 7) {
//            System.out.println(week[num - 1]);
//        } else {
//            System.out.println("잘못 입력 하셨습니다.");
//        }

        // target의 인덱스 구하기
        // 찾을 target은 1~10까지 입력받기
        // 값 target이 처음 나타나는 인덱스를 찾고, 없으면 -1을 출력하기
        int[] a = {4, 2, 7, 2, 3, 7, 4};

        System.out.print("숫자를 입력하세요(1~10): ");
        int target = scanner.nextInt();
        int idx = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                idx = i;
                break;
            }
        }
        System.out.println("target 인덱스 : " + idx);

    }
}
