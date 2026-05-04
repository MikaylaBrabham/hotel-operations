package com.pluralsight;
//add variables for stored data only and skip derived
public class Room {
    //add variables and their data properties
    private int numberOfBeds;
    private double price;
    private boolean isoccupied;
    private boolean isdirty;



    //get stored construtors
    public Room(int numberOfBeds, double price, boolean isoccupied, boolean isdirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isoccupied = isoccupied;
        this.isdirty = isdirty;
    }


    // get stored getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIsoccupied() {
        return isoccupied;
    }

    public boolean isIsdirty() {
        return isdirty;
    }



    //add in derived getter
    public boolean isAvailable(){

    }
}


