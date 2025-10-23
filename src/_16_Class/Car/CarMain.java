package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car(); // 기본생성자(NoArgsConstructor)
        audi.carName = "A7";
        Car santafe = new Car("싼타페");
        Car sorrento = new Car("쏘렌토", 2025, "검정색");
        sorrento.showInfo();

        Car car = new Car();

    }
}
