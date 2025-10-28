package _17_Inheritance.Shipment;

public class Main {
    public static void main(String[] args) {
        Shipment shipment = new Shipment("부산", "서울");
        System.out.println(shipment.route());

        System.out.println();

        BikeShipment bike = new BikeShipment("서면", "해운대");
        System.out.println(bike.route());
        System.out.println(bike.calcFee(5, 14));

        System.out.println();

        TruckShipment tuck = new TruckShipment("부산", "서울");
        System.out.println(tuck.route());
        System.out.println(tuck.calcFee(1000, 320));

    }
}
