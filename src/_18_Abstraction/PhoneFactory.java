package _18_Abstraction;

public class PhoneFactory extends Factory {
    // 추상 클래스를 상속받으면 반드시 추상메소드를 재정의해줘야 한다.
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생성합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getFactoryName() + "을 관리합니다.");
    }
}
