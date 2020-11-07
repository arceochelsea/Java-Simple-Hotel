package com.chelsea;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    private String guestName;
    private ArrayList<Integer> availableRooms;
    private ArrayList<Integer> unavailableRooms;

    public Hotel(String guestName, ArrayList<Integer> availableRooms, ArrayList<Integer> unavailableRooms) {

        this.guestName = guestName;
        this.availableRooms = availableRooms;
        this.unavailableRooms = unavailableRooms;

        availableRooms.add(111);
        availableRooms.add(222);
        availableRooms.add(333);
        availableRooms.add(444);
        availableRooms.add(555);
    }

    public void checkInRoom() {
        System.out.println("You are now checked into room: " + availableRooms.get(0));

        unavailableRooms.add(availableRooms.get(0));
        availableRooms.remove(0);

        System.out.println("Enjoy your stay at the fab Motel 6~");

        displayAvailableRooms();
        displayUnavailableRooms();
    }

    public void guestStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, are you ready to check out now? Write YES or NO");
        String guestAnswer = scanner.nextLine().toLowerCase().trim();

        if (guestAnswer.equals("yes")) {
            checkOutRoom();
        } else {
            System.out.println("Sure. We will check on your status later.");
            guestStatus();
        }
    }

    public void checkOutRoom() {
        System.out.println("You are now checking out of room: " + unavailableRooms.get(0));

        availableRooms.add(unavailableRooms.get(0));
        unavailableRooms.remove(0);

        System.out.println("Thank you! Please come back again soon!");

        displayAvailableRooms();
        displayUnavailableRooms();
    }

    public void displayAvailableRooms(){
        System.out.println("available rooms: " + availableRooms);
    }

    public void displayUnavailableRooms() {
        System.out.println("unavailable rooms: " + unavailableRooms);
    }

}
