package _19_Interface.SmartDevice;

/*
* 필드에 각 가전이 들어있음
* 고유 메서드로
* turnOnAll() => 모든 가전의 전원을 킴
* turnOffAll() => 모든 가전의 전원을 끔
* showStatus() => 모든 가전의 상태 출력
* */
public class SmartHomeHub {
    SmartAirConditioner smartAirConditioner;
    SmartLight smartLight;
    SmartSpeaker smartSpeaker;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartLight smartLight, SmartSpeaker smartSpeaker) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartLight = smartLight;
        this.smartSpeaker = smartSpeaker;
    }

    public void turnOnAll() {
        smartAirConditioner.turnOn();
        smartLight.turnOn();
        smartSpeaker.turnOn();
    }

    public void turnOffAll() {
        smartAirConditioner.turnOff();
        smartLight.turnOff();
        smartSpeaker.turnOff();
    }

    public void showStatus() {
        System.out.println("스마트 에어컨 : " + ((smartAirConditioner.isTurnedOn()) ? "On" : "OFF"));
        System.out.println("스마트 라이트 : " + ((smartLight.isTurnedOn()) ? "On" : "OFF"));
        System.out.println("스마트 스피커 : " + ((smartSpeaker.isTurnedOn()) ? "On" : "OFF"));

    }

}
