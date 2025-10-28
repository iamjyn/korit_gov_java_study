package _17_Inheritance;

import _17_Inheritance.Message.FancyMessage;
import _17_Inheritance.Message.Message;
import _17_Inheritance.Message.SimpleMessage;

public class Main {
    public static void main(String[] args) {
        // 상속 - 기존 클래스(부모 클래스)의 속성과 기능(메소드)을
        // 새로운 클래스(자식 클래스)가 물려받는 것
        // 왜?
        // => 코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념
        // => 유지 보수 공통 기능이 한 곳(부모 클래스)에 있으므로
        // 수정 해야할 일이 생기면 부모 클래스 하나만 고치면 자식들 모두 반영됨
        // => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다.
        // ===> 개방 폐쇄 원칙 - 확장에는 열려있고, 수정(뼌경)에는 닫혀있어야 한다.

        /*
        * 자식 클래스는 부모의 코드를 그대로 사용할 수 있다.
        * 자식 클래스는 필요한 기능을 추가하거나, 변경(오버라이딩)도 가능
        */

        Animal animal1 = new Animal("호랑이", 5);
        animal1.move();

        Tiger tiger = new Tiger("호랑이", 5, true);
        tiger.move();
        tiger.hunt();

        System.out.println();
        Human human = new Human();

        human.setAnimalName("홍길동");
        human.setAnimalAge(22);
        human.setLanguage("한국어");

        human.showInfo();

        System.out.println();

        human.getAnimalName();
        human.getAnimalAge();
        human.read("홍길동전");
        human.move();

        System.out.println();

        Message message = new Message("가나다라마바사");
        message.print();

        SimpleMessage simple = new SimpleMessage("가나다라마바사");
        simple.print();

        FancyMessage fancy = new FancyMessage("가나다라마바사");
        fancy.print();

    }
}
