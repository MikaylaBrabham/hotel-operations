package com.pluralsight;
//add Reservation class
public class Reservation {
        //add outlined stored method attributes
        private String roomType;
        private double price;
        private int numberOfNights;
        private boolean isWeekend;
        //private double reservationTotal; = derived

    //add constructors
    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //add get to stored constructors
    public String getRoomType() {
            return roomType;
        }
    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }


    //add set to stored constructors
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}
