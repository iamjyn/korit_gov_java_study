package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember = NonStaticMember.builder()
                .name("홍길동")
                .email("abc@naver.com")
                .age(22)
                .build();
        System.out.println(nonStaticMember);
    }
}
