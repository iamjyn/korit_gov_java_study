package _18_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setFactoryName("애플 공장");
        phoneFactory1.produce("iPhone17");
        phoneFactory1.manage();
        phoneFactory1.displayInfo();

        // 익명 클래스
        Factory factory = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getFactoryName());
            }

            @Override
            public void manage() {
                System.out.println(super.getFactoryName());
            }
        };

        /*
        * 위와 같이 추상 클래스의 개념을 벗어나는 객체 생성은 익명 클래스라는 개념 덕분이다.
        * 즉 재사용하지 않고, 한 번만 사용하고 버릴 거라면
        * (Main 클래스에서만 사용하고 다른 곳에서 사용하지 않을 거라면) 익명 클래스가 유용하다.
        *
        * 그렇다고 해서 추상 클래스 Factory의 객체가 생성된 것이 아닌
        * 임시(즉석)로 만들어진 이름 없는 자식 클래스다.
        * 이름 없는 자식 클래스 == 익명 클래스
        *
        * 그래서 추상 클래스의 객체가 만들어진 것이 아니지만
        * 추상 클래스의 개념은 지키고 있다.
        */

        PhoneFactory phoneFactory2 = new PhoneFactory();
        phoneFactory2.setFactoryName("삼성 공장");
        phoneFactory2.produce("갤럭시S 25");

        System.out.println();

        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setFactoryName("애플 태블릿 공장");
        tabletFactory1.manage();
        tabletFactory1.displayInfo();
        tabletFactory1.produce("아이패드 미니 6세대");
        tabletFactory1.upgrade("아이패드 미니 7세대");

    }
}
