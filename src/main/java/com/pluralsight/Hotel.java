package com.pluralsight;
//import
import java.time.LocalDateTime;
public class Hotel {

    // stored for first
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


//set1 = number suites & rooms constructor

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites = 0;
        this.bookedBasicRooms = bookedBasicRooms = 0;
    }

    //set 2 constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // add getters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }


    // add get available suites
    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    //add get available rooms
    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }


    //add  public boolean bookroom derived method
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
// have to go last because derived from get avaialble suites and rooms mentioned earlier
    }


}