package _17_Inheritance.Shipment;

/* 자식클래스 BikeShipment
* Allargs 생성자
* calcFee(무게, 거리) 오버라이드
* => 기본금액 2000에 무게당 20 + 거리당 50 반환
* 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
*/
public class BikeShipment extends Shipment{
    public BikeShipment(String start, String end) {
        super(start, end);
    }

    @Override
    public int calcFee(int weight, int distance) {
        int fee = 2000;
        if (weight < 0) {
            weight = 0;
        }
        if (distance < 0) {
            distance = 0;
        }
        return fee + (weight * 20) + (distance * 50);
    }
}
