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

//        int end = 10;
//        int start = 3;
//
//        int num = end - start + 1;
//        int[] answer = new int[num];
//
//        for (int i = 0; i <= answer.length; i++) {
//            Arrays.stream(answer).toArray();
//        }
//        System.out.println(Arrays.toString(answer));

//        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
//        int answer = 0;
//
//        for (int num : num_list) {
//            if (num > 0) {
//                answer++;
//            } else {
//                answer = -1;
//            }
//        }
//        System.out.println(answer);;

        int[] num_list = {5, 2, 1, 7, 5};

        int[] answer = new int[num_list.length + 1]; //4

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_list.length -1] > num_list[num_list.length -2]) {
            answer[answer.length -1] = num_list[num_list.length -1] - num_list[num_list.length -2];
        } else {
            answer[answer.length -1] = num_list[num_list.length -1] * 2;
        }

        System.out.println(Arrays.toString(answer));





    }
}
