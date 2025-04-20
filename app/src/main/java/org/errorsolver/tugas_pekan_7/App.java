package org.errorsolver.tugas_pekan_7;

public class App {
    private final int gear = 5;
    private final int speed = 10;
    private final int seat = 2;
    private final int tireSize = 26;

    public static void main(String[] args) {
        App app = new App();

        BikeInheritedDemo bikeInheritedDemo = new BikeInheritedDemo(app.gear, app.speed, app.seat, app.tireSize);
        bikeInheritedDemo.ShowBikes();
    }
}
