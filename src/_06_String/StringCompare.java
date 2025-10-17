package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 = "Java";
        String str2 = "Python";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str1.equalsIgnoreCase("java")); // 대소문자 구분없이 같냐?

        System.out.println("=".repeat(30));
        str1 = "1234";
        str2 = "1234";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str1 = new String("1234");
        str2 = new String("1234");
        System.out.println(str1 == str2); // 참조 위치(주소값) 비교
        System.out.println(str1.equals(str2)); // 내용 비교

    }

}
