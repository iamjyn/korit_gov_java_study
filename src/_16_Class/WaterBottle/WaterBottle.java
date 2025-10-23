package _16_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    public WaterBottle() {
    }

    public WaterBottle(int currentWater) {
        this.currentWater = currentWater;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    // 채우기
    public void fill(int water) {
        if (water < 0) {
            System.out.println("잘못된 숫자입니다.");
        } else if (water > 1000 - currentWater){
            System.out.println("용량초과");
        } else {
            currentWater += water;
        }
    }

    // 마시기
    public void drink(int water) {
        if (water < 0) {
            System.out.println("잘못된 숫자입니다.");
        } else if (water > currentWater) {
            System.out.println("물이 모자랍니다.");
        } else {
            currentWater -= water;
        }
    }

}
