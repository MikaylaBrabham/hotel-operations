package com.pluralsight;
//import
import java.time.LocalDateTime;
public class Hotel {

    // stored for first
    private String name;

    //keeps up with type od room
    private boolean type;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    //set1 = number suites & rooms
    public Hotel(String name, boolean type, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.type = type;
        this.numberOfSuites = numberOfSuites = 0;
        this.numberOfRooms = numberOfRooms = 0;
    }


    //set2 = spec # of bookedsuites and bookedbasicrooms
}
