package com.pluralsight;

public class HotelOperations {
    //insert main method
    public static void main(String[] args) {
        Room room1 = new Room(2, 200.00, false, false);
        room1.checkIn();
       System.out.println(room1.isAvailable());
       System.out.println(room1.isOccupied());

    }
}

// test employee

// test hotel

//test reservation

//test room


