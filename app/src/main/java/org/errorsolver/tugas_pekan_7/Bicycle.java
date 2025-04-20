package org.errorsolver.tugas_pekan_7;

public class Bicycle {

    int speed = 0;
    int gear = 0;

    public void changeGear(int newValue) {
        this.gear = gear + newValue;
        System.out.println("Gear = " + gear);
    }

    public void speedUp(int increment) {
        this.speed = speed + increment;
        System.out.println("Speed = " + speed);
    }
}
