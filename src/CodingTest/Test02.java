package CodingTest;

import java.util.Arrays;

public class Test02 {
//    public static int[] solution(int start_num, int end_num) {
//        int num = end_num - start_num + 1;
//        int[] answer = new int[num];
//
//        for (int i = 0; i <= num; i++) {
//            answer[i] = start_num;
//            start_num++;
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
//        solution(3, 10);

        int end = 10;
        int start = 3;

        int num = end - start + 1;
        int[] answer = new int[num];

        for (int i = 0; i <= answer.length; i++) {
            Arrays.stream(answer).toArray();
        }
        System.out.println(Arrays.toString(answer));

    }
}
