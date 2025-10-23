package _16_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        // WaterBottle
        // currentWater 물의 양 => 속성
        // 메소드 물 채우기 fill ==> 최대용량 1000으로 이상으로 채울 수 없음
        // 메소드 물 마시기 drink =>  현재 용량보다 초과해서 마실 수 없음
        // getter로 현재 물의 양 출력

        WaterBottle waterBottle = new WaterBottle();
        waterBottle.setCurrentWater(50);
        System.out.println(waterBottle.getCurrentWater());
        waterBottle.fill(-10);
        waterBottle.fill(50);
        System.out.println(waterBottle.getCurrentWater());
        waterBottle.fill(5000);
        System.out.println(waterBottle.getCurrentWater());
        waterBottle.drink(-10);
        waterBottle.drink(3000);
        waterBottle.drink(30);
        System.out.println(waterBottle.getCurrentWater());

    }
}
