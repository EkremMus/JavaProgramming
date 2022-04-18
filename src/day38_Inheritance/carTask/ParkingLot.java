package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota ("Camry", 2020, 25000, "Gray", 1234);

        Tesla tesla = new Tesla ("Model X", 2022, 45000, "Black", 0);

        BMW bmw = new BMW ("745", 2021, 43000, "White", 123 );

        toyota.reliable();
        bmw.raceCar();
        tesla.autoPilot();

        System.out.println(toyota);
        tesla.start();
        toyota.start();

    }
}
