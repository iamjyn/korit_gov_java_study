package _17_Inheritance.Shipment;

/* 배송비 계산기
* 클래스 Shipment
* 속성은 출발지, 목적지
* Allargs 생성자
* route() 메소드 리턴 예 => "부산 -> 서울"
* calcFee() 메소드 파라미터 무게와 거리, 리턴은 그냥 0을 리턴
* calcFee는 자식 클래스에서 재정의할 예정
*/
public class Shipment {
    private String start;
    private String end;

    public Shipment(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String route() {
        return this.start + " -> " + this.end;
    }

    public int calcFee(int weight, int distance) {
        return 0;
    }

}
