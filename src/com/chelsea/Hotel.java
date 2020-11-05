package com.chelsea;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    private Scanner scanner;
    private String renter;
    private ArrayList<Integer> availableRooms;
    private ArrayList<Integer> unavailableRooms;
    private int numberOfRooms;

    public Hotel(Scanner scanner, String renter, ArrayList<Integer> availableRooms, ArrayList<Integer> unavailableRooms, int numberOfRooms) {

        this.scanner = scanner;
        this.renter = renter;
        this.availableRooms = availableRooms;
        this.unavailableRooms = unavailableRooms;
        this.numberOfRooms = numberOfRooms;

        availableRooms.add(000);
        availableRooms.add(121);
        availableRooms.add(222);
        availableRooms.add(333);
        availableRooms.add(444);

//        int room = 0;
//        for (int i = 0; i < availableRooms.size(); i++) {
//            availableRooms.add(room);
//        }

    }

    public void welcomePrompt() {

        System.out.println("Please enter your name here!");
        renter = scanner.nextLine();
        System.out.println("Thank you, " + renter + " for choosing Motel 6, how many rooms would you like to book today?");
        numberOfRooms = scanner.nextInt();

        if (numberOfRooms <= availableRooms.size()) {
            System.out.println("Thank you, " + renter + " you just booked " + numberOfRooms + " room(s) with us today.");
            checkInRoom();
        } else {
            System.out.println("Sorry, " + renter + " we do not have this many rooms available, come back again!");
        }
    }

    public void displayAvailableRooms(){
        System.out.println("These room(s) are still available: " + availableRooms);
    }

    public void displayUnavailableRooms() {
        System.out.println("These room(s) are currently occupied: " + unavailableRooms);
    }

    public void checkInRoom() {
        //remove room from availrooms arraylist
        //add to unavailablerooms arraylist

        availableRooms.remove(0);
        unavailableRooms.add(availableRooms.get(0));
        System.out.println(renter + ", you are now checked into room: " + availableRooms.get(0));
        System.out.println("Enjoy your stay at the fab Motel 6~");

    }

    public void checkOutRoom() {
        //remove() from unavailalberooms
        //add() to to availablerooms


        System.out.println("Please come back again soon!");
    }

    public String toString() {
        return renter + " is now checking into room: " + availableRooms + ".";
    }

}
