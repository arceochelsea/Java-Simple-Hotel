package com.chelsea;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    private Scanner scanner;
    private String renter;
    private ArrayList<Integer> availableRooms;
    private ArrayList<Integer> unavailableRooms;

    public Hotel(Scanner scanner, String renter, ArrayList<Integer> availableRooms, ArrayList<Integer> unavailableRooms) {
        this.scanner = scanner;
        this.renter = renter;
        this.availableRooms = availableRooms;
        this.unavailableRooms = unavailableRooms;

        availableRooms.add(111);
        availableRooms.add(222);
        availableRooms.add(333);
        availableRooms.add(444);

    }

    public void welcomePrompt() {
        System.out.println("Please enter your name here!");
        renter = scanner.nextLine();
        System.out.println("Thank you, " + renter + " for choosing Motel 6, how many rooms would you like to book today?");
        Integer answer = scanner.nextInt();

        int roomsLength = availableRooms.size();
        //System.out.println("This is how many rooms we got: " + roomsLength);

        if (answer <= roomsLength) {
            System.out.println("Thank you, you just booked " + answer + " room(s) with us today. ");
            checkInRoom();
        } else {
            System.out.println("Sorry we do not have this many rooms available, come back again!");
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
        unavailableRooms.add(0); //able to take two params, need to have a param for the rooms being inserted and removed from arraylists

        //The java.util.ArrayList.add(int index, E element)
        // method inserts the specified element E at the specified
        // position in this list.It shifts the element currently at that
        // position (if any) and any subsequent elements to the right (will add one to their indices).

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
