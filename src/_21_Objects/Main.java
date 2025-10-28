package _21_Objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("홍길동", "성균관대학교");
        System.out.println(teacher1.toString());
        System.out.println(teacher1); // 객체명만 호출해도 가능함

        Teacher teacher2 = new Teacher("홍길동", "성균관대학교");
        System.out.println(teacher1.equals(teacher2)); // 객체에서 equals는 참조주소 비교
        //equals가 같으면 hashCode도 같고, 다르면 다르다.

        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());

    }
}
