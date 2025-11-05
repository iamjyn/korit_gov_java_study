package _31_StringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        // String(final,불변)
        // StringBuffer(가변) : 병렬연산해야하는 스레드 환경에서 안정적
        // StringBuilder(가변) : 연산속도가 제일 빠름 (단일 스레드 환경에서 주로 사용)
        // 빌더랑 버퍼 메소드 똑같음

        String str = "abcdefg";
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder("abcdefg");
        System.out.println(sb);
        System.out.println(sb == sb2);
        System.out.println(sb.equals(sb2));
        System.out.println(sb.toString().equals(sb2.toString()));

        // String 변환 / StringBuilder -> String
        System.out.println("문자열 String 변환: " + sb.toString());

        // 문자열 추출
        System.out.println("문자열 추출: " + sb.substring(2, 4));

        // 문자열 추가
        System.out.println("문자열 추가: " + sb.insert(2, "추가"));

        // 문자열 삭제
        System.out.println("문자열 삭제: " + sb.delete(2, 4));

        // 문자열 연결(덧셈연산)
        System.out.println("문자열 연결: " + sb.append("hijk"));

        // 문자열 길이
        System.out.println("문자열 길이: " + sb.length());

        // 용량의 크기
        System.out.println("용량의 크기: " + sb.capacity());

        // 문자열 뒤집기
        System.out.println("문자열 뒤집기: " + sb.reverse());
    }
}
