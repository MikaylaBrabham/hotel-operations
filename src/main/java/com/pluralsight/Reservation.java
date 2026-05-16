package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

//add Reservation class
public class Reservation {
    //add outlined stored method attributes
    private String roomType;
    // private double price; = derived
    private int numberOfNights;
    private boolean isWeekend;
    //private double reservationTotal; = derived

    //add constructors
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        // this.price = price; = derived
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

    }

    // get getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase().trim();
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // add prices for different rooms under price
    public double getPrice() {
        if(this.roomType.equalsIgnoreCase("king")) {
            return 139.00;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            return 124.00;
        }
        return 0.00;
    }

    // get reservation total
    public double getReservationTotal() {

        double total = this.getNumberOfNights() * this.getPrice();

        if (this.isWeekend()) {
            total = total + (total * .10);
        }
        return total;
    }
}
