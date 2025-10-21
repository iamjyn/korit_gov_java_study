package _14_Method;

public class MethodEx {
    public static int max(int a, int b, int c) {
        int[] nums = {a, b, c};
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int absolute(int num) {
        return num > 0 ? num : -(num);
    }

    public static boolean contains(int[] nums, int n) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == n) {
//                return true;
//            }
//        }
//        return false;

        for (int num : nums) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 최댓값 구하기 (3 수를 전달)
        // max(3, 7, 5) => 7
        System.out.println(max(3,7,5));

        // 홀짝 판단
        // isEven(8) => True (짝수면 true, 홀수면 false)
        System.out.println(isEven(8));

        // 절댓값 구하기 absolute
        // 삼항연산자 이용해서
        System.out.println(absolute(-3));

        // 포함여부
        // contains ([1,3,5], 3이 있으면 true, 없으면 false)
        int[] nums = {1, 3, 5};
        System.out.println(contains(nums, 1));
        System.out.println(contains(nums, 2));



    }
}
