package org.errorsolver.tugas_pekan_7;

public class RacingBike extends Bicycle {

    private int tireSize;

    public void changeTireSize(int newTireSize) {
        this.tireSize = newTireSize;
        System.out.println("Tire = " + this.tireSize);
    }
}
