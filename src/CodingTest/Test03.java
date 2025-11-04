package CodingTest;

public class Test03 {
    public static void main(String[] args) {
        int answer = 0;
        int[] num_list = {5, 7, 8, 3};

        int add = 0;
        int multiple = 1;

        for (int num : num_list) {
            multiple *= num;
        }
        System.out.println(multiple);


        for (int num : num_list) {
            add += num;
        }
        add *= add;

        answer = multiple < add ? 1 : 0;
        System.out.println(answer);
    }
}
