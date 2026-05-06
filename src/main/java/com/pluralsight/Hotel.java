package com.pluralsight;
//import
import java.time.LocalDateTime;
public class Hotel {

    // stored for first
    private String name;

    //keeps up with type od room
    private boolean isSuite;
    private boolean isRoom;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    //set1 = number suites & rooms
    public Hotel(String name, boolean isSuite,boolean isRoom, int numberOfSuites, int numberOfRooms)
    {
        this.name = name;
        this.isSuite = isSuite;
        this.isRoom = isRoom;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;

    }

    //add private setter

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public void setRoom(boolean room) {
        isRoom = room;
    }

    public void setSuite(boolean suite) {
        isSuite = suite;
    }

    public void setName(String name) {
        this.name = name;
    }




    //set2 = spec # of bookedsuites and bookedbasicrooms
    public Hotel(String name, boolean isSuite,boolean isRoom, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.isSuite = isSuite;
        this.isRoom = isRoom;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites = 0;
        this.bookedBasicRooms = bookedBasicRooms = 0;
    }

    //add private setter


    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }
}
