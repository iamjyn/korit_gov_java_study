package _16_Class.Car;

public class Car {
    // 속성 === 필드 === 멤버변수
    String carName;
    int carYearModel;
    String carColor;

    // 생성자: 객체가 호출될 때 생성되는 것
    // Car클래스의 생성자
    // 속성(필드)값이 없는 (기본)생성자 : NoArgsConstructor

    public Car() {
    }


    /*
    * this: 해당 클래스로 만들어진 자기 자신 객체를 의미(참조)
    * this를 왜 써야하는 가?
    * => 속성의 이름과 매개변수의 이름이 같을 경우 명확히 하기 위해서 this를 사용
    * => 속성의 이름과 매개변수의 이름이 다를 경우는 this가 생략 가능
    * */

    // 속성(필드)값이 일부만 있는 생성자 : RequiredArgsConstructor
    public Car(String carName) {
        this.carName = carName;
//        System.out.println("RequiredArgsConstructor");
    }

    // 속성(필드)값이 모두 있는 생성자 : AllArgsConstructor
    public Car(String carName, int carYearModel, String carColor) {
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
//        System.out.println("AllArgsConstructor");
    }

    public void startCar() {
        System.out.println(carName + "가 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + "가 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "가 정지합니다.");
    }

    public void showInfo() {
        System.out.println("자동차 이름: " + carName);
        System.out.println("자동차 연식: " + carYearModel);
        System.out.println("자동차 색상: " + carColor);

    }




}
