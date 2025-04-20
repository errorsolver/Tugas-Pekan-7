package org.errorsolver.tugas_pekan_7;

public class TandemBike extends Bicycle {

    private int seat;

    public TandemBike() {}

    public void totalSeat(int newSeat) {
        this.seat = newSeat;
        System.out.println("Seat = " + this.seat);
    }
}
