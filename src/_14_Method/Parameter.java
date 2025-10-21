package _14_Method;

public class Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }

    public static void powerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }

    public static void average (int a, int b, int c) {
        System.out.println("평균: " + ((a + b + c) / 3.0));
    }

    public static void parityCheck (int num) {
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
    }



    public static void main(String[] args) {
        power(2);
        powerByExp(2, 4);

        // 3개의 정수를 전달하여 평균을 출력하는 메소드
        average(80, 70, 60);

        // 정수를 전달하여 짝수인지 홀수인지 판별 후 출력하는 메소드 (삼항연산자 사용)
        parityCheck(1);
        parityCheck(2);









    }
}
