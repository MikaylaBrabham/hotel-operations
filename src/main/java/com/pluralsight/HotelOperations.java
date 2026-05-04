package com.pluralsight;

public class HotelOperations {
    //insert main method
    public static void main(String[] args) {

    }

    // add room class
private class Room {
        //add variables and their data properties
        private double NumberOfBeds;
        private double price;
        private boolean occupied;
        private boolean dirty;
        private boolean available;

        //add getters
        public double getNumberOfBeds() {
            return NumberOfBeds;
        }
        public double getPrice() {
            return price;
        }

        public boolean isOccupied() {
            return occupied;
        }

        public boolean isDirty() {
            return dirty;
        }

        public boolean isAvailable() {
            return available;
        }
        // add constructors empty ones
        public Room(double numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
            NumberOfBeds = numberOfBeds;
            this.price = price;
            this.occupied = occupied;
            this.dirty = dirty;
            this.available = available;
        }
    }
//add Reservation class
private class Reservation{
        //add outlined classes
    private String RoomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    //add reservation constructors

}
//add Employee Class
private class Employee{

}
}
