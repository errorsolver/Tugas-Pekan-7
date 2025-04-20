package org.errorsolver.tugas_pekan_7;

public class BikeInheritedDemo {

    private final static int SPEED = 10;
    private final static int GEAR = 5;
    private final static int SETHEIGHT = 8;
    private final static int TIRESIZE = 26;
    private final static int SEAT = 2;

    BikeInheritedDemo() {}

    private final MountainBike mBike = new MountainBike();
    private final RacingBike rBike = new RacingBike();
    private final TandemBike tBike = new TandemBike();

    public static void main(String[] args) {
        BikeInheritedDemo bikeInheritedDemo = new BikeInheritedDemo();
        bikeInheritedDemo.ShowBikes();
    }

    public void ShowBikes() {
        generalBike(this.mBike, this.mBike);
        spacer();
        generalBike("Racing", this.rBike);
        spacer();
        generalBike("Tandem", this.tBike);
    }

    private void spacer() {
        System.out.println("---");
    }

    private <T> void generalBike(T bikeClass, MountainBike bike) {
        String name = bikeClass.getClass().getSimpleName();
        System.out.println(name);
        bike.speedUp(BikeInheritedDemo.SPEED);
        bike.changeGear(BikeInheritedDemo.GEAR);
        bike.setHeight(BikeInheritedDemo.SETHEIGHT);
    }

    private <T> void generalBike(T bikeClass, RacingBike bike) {
        String name = bikeClass.getClass().getSimpleName();
        System.out.println(name);
        bike.speedUp(BikeInheritedDemo.SPEED);
        bike.changeGear(BikeInheritedDemo.GEAR);
        bike.changeTireSize(BikeInheritedDemo.TIRESIZE);
    }

    private <T> void generalBike(T bikeClass, TandemBike bike) {
        String name = bikeClass.getClass().getSimpleName();
        System.out.println(name);
        bike.speedUp(BikeInheritedDemo.SPEED);
        bike.changeGear(BikeInheritedDemo.GEAR);
        bike.totalSeat(BikeInheritedDemo.SEAT);
    }
}
