package com.pluralsight;
//add Reservation class
public class Reservation {
        //add outlined stored method attributes
        private String roomType;
        private double price;
        private int numberOfNights;
        private boolean weekend;
        //private double reservationTotal; = derived

    //add constructors
    public Reservation(String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }
    //add get to stored constructors
}
