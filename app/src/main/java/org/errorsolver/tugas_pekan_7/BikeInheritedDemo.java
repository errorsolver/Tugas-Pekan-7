package org.errorsolver.tugas_pekan_7;

public class BikeInheritedDemo {

    private final int gear;
    private final int speed;
    private final int seat;
    private final int tireSize;

    private RacingBike racingBike = null;
    private TandemBike tandemBike = null;

    public BikeInheritedDemo(int gear, int speed, int seat, int tireSize) {
        this.gear = gear;
        this.speed = speed;
        this.seat = seat;
        this.tireSize = tireSize;

        this.racingBike = new RacingBike();
        this.tandemBike = new TandemBike();
    }

    public void ShowBikes() {
        System.out.println("Racing Bike");
        this.racingBike.changeGear(this.gear);
        this.racingBike.speedUp(this.speed);
        this.racingBike.changeTireSize(this.tireSize);

        System.out.println("Tandem Bike");
        this.tandemBike.changeGear(this.gear);
        this.tandemBike.speedUp(this.speed);
        this.tandemBike.totalSeat(this.seat);
    }
}
