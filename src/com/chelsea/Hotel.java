package com.chelsea;

import java.util.Arrays;

public class Hotel {

    public String renter;
    public int [] availableRooms = {};
    public int [] unavailableRooms = {};

    //array has a set length ARRAY LIST does not
    //public ArrayList<Integer> availableRooms = new ArrayList<>();

    public Hotel(String renter, int[] availableRooms)
            //, Integer... rooms)
    {
        this.renter = renter;
        this.availableRooms = availableRooms;

//        for (Integer room : availableRooms)
//            availableRooms.add(room);

    }

    public void displayAvailableRooms(){
        System.out.println(Arrays.toString(availableRooms));
    }

    public void checkInRoom() {
        System.out.println("we are checking in");
    }

    public void checkOutRoom() {
        System.out.println("we are checking out");
    }

    public String toString() {
        return renter + " is now checking into room: " + Arrays.toString(availableRooms) + ".";
    }

}
