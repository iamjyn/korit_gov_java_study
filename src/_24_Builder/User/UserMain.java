package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .userId(123)
                .password("")
                .email("123naver.com")
                .build();
        System.out.println(user);
    }
}
