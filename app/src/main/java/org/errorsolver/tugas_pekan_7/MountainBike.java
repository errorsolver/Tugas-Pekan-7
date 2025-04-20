package org.errorsolver.tugas_pekan_7;

public class MountainBike extends Bicycle{
    private int seatHeight;
    
    public void setHeight(int newValue){
        seatHeight = newValue;
        System.out.println("Seat Height = "+seatHeight);
    }
}

