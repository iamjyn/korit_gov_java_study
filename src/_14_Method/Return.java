package _14_Method;

public class Return {
    public static String getName() {
        String name = "홍길동";
        return name;
    }

    public static int getAge() {
        int age = 30;
        return age;
    }

    public static void main(String[] args) {
        // 반환값
        // void는 반환값이 없다라는 의미
        // return
        String name = getName();
        System.out.println(name);
        System.out.println(getName());

        int myAge = getAge();
        System.out.println(myAge);
        System.out.println(getAge());
    }
}
