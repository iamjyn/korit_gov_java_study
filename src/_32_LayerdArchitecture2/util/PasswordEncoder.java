package _32_LayerdArchitecture2.util;

import java.util.Objects;

public class PasswordEncoder {
    private static final String secrets = "암호화비밀번호";

    public static String encode(String str) {
        if (str == null) {
            return null;
        }
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        long encodedHash = hash + Objects.hash(secrets);
        return Long.toHexString(encodedHash); // toHexString() : 16진수 문자열로 변환
    }

    // 로그인할 때
    public static boolean match(String 평문, String 암호문) {
        if (평문 == null || 암호문 == null) {
            return false;
        }
        return encode(평문).equals(암호문);
    }
}
