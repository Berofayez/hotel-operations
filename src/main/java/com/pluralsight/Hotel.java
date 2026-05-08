package com.pluralsight;

public class Hotel {
    private final String name;
    private final int numberOfSuits;
    private final int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuits, int numberOfRooms) {
        this.name = name;
        this.numberOfSuits = numberOfSuits;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuits, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this(name, numberOfSuits, numberOfRooms);
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuits() {
        return numberOfSuits;
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

    public int getAvailableSuites(){
        return numberOfSuits - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite) {
            if (getAvailableSuites() >= numberOfRooms) {
                bookedSuites -= numberOfRooms;
                return true;
            }
        }else{
            if(getAvailableRooms() >= numberOfRooms){
                bookedBasicRooms -= numberOfRooms;
                return true;
            }
        }
        return false;
    }
}
