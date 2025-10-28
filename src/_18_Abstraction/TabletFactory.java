package _18_Abstraction;
/*
* 문제)
* Factory 추상 클래스 상속 받을 것
* 고유 메소드로 upgrade(String model)을 정의
* 예) 객체명.upgrade("아이패드 프로 13인치 8세대");로 호출하면
* "아이패드 프로 13인치 8세대로 업그레이드 합니다" 출력
*
* produce() / menage() 메소드를 태블릿 공장에 맞게 적절히 수정할 것 (폰팩토리 참고)
*
* 메인 실행부에서 tabletFactory1 객체 생성하고 애플 태블릿 공장으로 이름 짓기
* */

public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블릿을 생성합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getFactoryName() + "을 관리합니다.");
    }

    public void upgrade (String model) {
        System.out.println("[ " + model + " ] 모델로 업그레이드 합니다.");
    }

}
