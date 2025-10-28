package _19_Interface.SmartDevice;

/*
* class
* SmartAirConditioner 만들고 SmartDevice 상속 받음
*
* 고유 속성
* bool turnedOn, int temperature = 24;
* getName => "스마트 에어컨" 리턴
*
* turnOn => 해당 가전 이름"의 전원을 켭니다. 설정 온도: **도"
* turnedOn = true;
*
* turnOff => 반대로
* isTurnedOn => 현재 전원 상태 리턴
*
* 고유 메소드
* 온도 올리는 거 하나, 내리는 거 하나
* 전원이 꺼져있으면 => "현재 전원이 꺼져있습니다." 출력
* */

public class SmartAirConditioner implements SmartDevice {
    private boolean turnedOn;
    private int temperature = 24;

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 켭니다.\n설정 온도: " + temperature + "℃");
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName() + "의 전원을 끕니다.");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void temperatureUp() {
        if (turnedOn) {
            temperature++;
            System.out.println(getName() + "의 온도를 올립니다.\n현재 온도: " + temperature + "℃");
        } else {
            System.out.println("현재 " + getName() + "의 전원이 꺼져있습니다.");
        }
    }

    public void temperatureDown() {
        if (turnedOn) {
            temperature--;
            System.out.println(getName() + "의 온도를 내립니다.\n현재 온도: " + temperature + "℃");
        } else {
            System.out.println("현재 " + getName() + "의 전원이 꺼져있습니다.");
        }
    }


}
