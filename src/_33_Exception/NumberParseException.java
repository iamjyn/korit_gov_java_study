package _33_Exception;


import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        String str = scanner.nextLine();

        try {
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            System.out.println("숫자가 아닌 값을 입력하셨습니다.");
        }

        scanner.close();
    }
}
