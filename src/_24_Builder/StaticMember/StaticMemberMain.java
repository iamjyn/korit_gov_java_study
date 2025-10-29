package _24_Builder.StaticMember;

public class StaticMemberMain {
    public static void main(String[] args) {
        StaticMember staticMember = new StaticMember.Builder() // builder 객체 생성
                .name("홍길동")
                .age(20)
                .email("abc@naver.com")
                .build();

        /*
        * Builder 패턴을 서야하는 이유
        * 1. 필요한 필드 데이터만 설정 가능
        * 2. 유연성 확보
        * 3. 가독성 향상
        * 4. 변경 가능성을 최소화
        * */

    }
}
