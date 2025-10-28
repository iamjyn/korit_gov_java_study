package _19_Interface.SmartDevice;

/*
* 똑같이 속성으로 turnedOn, playListName = "발라드";
* 고유 메소드로 playListName을 파라미터로 받아서 해당 재생 목록을 재생하는 메소드
* => playListName + "를 재생합니다."
*/
public class SmartSpeaker implements SmartDevice{
    private boolean turnedOn;
    private String playListName = "발라드";

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public String getName() {
        return "스마트 스피커";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 켭니다.\n현재 재생 목록: " + playListName);
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

    public void playMusic(String playListName) {
        System.out.println(playListName + "를 재생합니다.");
    }

}
