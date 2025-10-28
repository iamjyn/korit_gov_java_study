package _19_Interface.SmartDevice;

/*
* 인터페이스 상속 받고 에어컨이랑 똑같이
* 필드 속성으로 turnedOn, brightness = 50;
*
* 고유메서드로 밝기를 올리는 거 하나 , 내리는 거 하나
* 올릴 거나 내릴 때 전원이 켜져있어야 하며 10씩 증감
* */
public class SmartLight implements SmartDevice{
    private boolean turnedOn;
    private int brightness = 50;

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String getName() {
        return "스마트 라이트";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 켭니다.\n밝기: " + brightness);
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

    public void brightnessUp() {
        if (turnedOn) {
            brightness += 10;
            System.out.println(getName() + "의 밝기를 올립니다.\n현재 밝기: " + brightness);
        } else {
            System.out.println("현재 " + getName() + "의 전원이 꺼져있습니다.");
        }
    }

    public void brightnessDown() {
        if (turnedOn) {
            brightness -= 10;
            System.out.println(getName() + "의 밝기를 올립니다.\n현재 밝기: " + brightness);
        } else {
            System.out.println("현재 " + getName() + "의 전원이 꺼져있습니다.");
        }
    }

}
