package com.pluralsight;
//add Reservation class
public class Reservation {
        //add outlined classes
        private String RoomType;
        private double price;
        private int numberOfNights;
        private boolean weekend;
        private double reservationTotal;

        //add reservation constructors
        public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
            RoomType = roomType =("king" || "double");
            this.price = price;
            this.numberOfNights = numberOfNights;
            this.weekend = weekend;
            this.reservationTotal = reservationTotal;
        }
        //add getters

        public String getRoomType() {
            return RoomType;
        }

        public double getPrice() {
            return price;
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public boolean isWeekend() {
            return weekend;
        }

        public double getReservationTotal() {
            return reservationTotal;
        }


        //add setters
    }
    }
