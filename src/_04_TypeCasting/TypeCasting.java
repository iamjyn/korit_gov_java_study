package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 정수에서 실수로
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);

        // 실수에서 정수로
        float scoreFloat = 88.1F;
        System.out.println((int) scoreFloat);

        double scoreDouble = 95.7;
        System.out.println(scoreDouble);
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int) 77.3;
        System.out.println(sum2);

        float sum3 = 98 + 77.3F;
        System.out.println(sum3);

        // 자동 형변환
        // int -> long / float / double
        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);

        // 수동 형변환
        // double, float, long -> int
        int convertedScoreInt = (int) scoreDouble;

        long scoreLong = 87L;
        convertedScoreInt = (int) scoreLong;

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

        // 숫자(정수)를 문자열로
        int num1 = 55;
        String strNum1 = String.valueOf(num1); // 첫 번째 방법
        strNum1 = Integer.toString(num1); // 두 번째 방법

        // 숫자(실수)를 문자열로
        double num2 = 55.5;
        String strNum2 = String.valueOf(num2); // 첫 번째 방법
        strNum2 = Double.toString(num2); // 두 번째 방법

        float num3 = 66.6F;
        String strNum3 = String.valueOf(num3); // 첫 번째 방법
        strNum3 = Float.toString(num3); // 두 번째 방법

        // 문자열을 숫자로
        String str = "99";
        int i = Integer.parseInt(str);
        double d = Double.parseDouble(str);
        float f = Float.parseFloat(str);

        System.out.println(f);

        // 정수만 출력하시오
        float floatNumber = 3.141592F;
//        int intNum = (int) floatNumber;
//        System.out.println(intNum);
        System.out.println((int) floatNumber);
        System.out.println();

    }
}
