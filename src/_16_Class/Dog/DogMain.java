package _16_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        // 객체 생성하는 방법
        Dog dog1 = new Dog(); // Dog  클래스를 가지고 dog1이라는 이름의 객체를 생성

        // 생성된 해당 객체 속성 값 대입 또는 변경
        dog1.name = "해피";
        dog1.age = 3;
        dog1.dogType = "시고르자브종";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.dogType);

        // 생성된 객체의 메소드를 호출하는 방법
        dog1.callName();
        dog1.showInfo();
    }
}
