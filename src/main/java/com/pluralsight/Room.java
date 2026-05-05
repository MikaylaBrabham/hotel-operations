package com.pluralsight;
//add variables for stored data only and skip derived
public class Room {
    //add variables and their data properties
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    //get stored construtors
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied= isOccupied;
        this.isDirty = isDirty;
    }


    // get stored getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {return isOccupied; }

    public boolean isDirty() {return isDirty;}

    //add in derived getter
    public boolean isAvailable(){
        //add rule if the room is dirty and occupied it's not available
        // work with the data given and adapt
        if (this.isDirty() && this.isOccupied()){
            return false;
        }
        else {
            return true;
        }

    }
}


