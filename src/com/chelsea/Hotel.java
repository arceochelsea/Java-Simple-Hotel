package com.chelsea;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    private Scanner scanner;
    private String guestName;
    private ArrayList<Integer> availableRooms;
    private ArrayList<Integer> unavailableRooms;

    public Hotel(Scanner scanner, String guestName, ArrayList<Integer> availableRooms, ArrayList<Integer> unavailableRooms) {

        this.scanner = scanner;
        this.guestName = guestName;
        this.availableRooms = availableRooms;
        this.unavailableRooms = unavailableRooms;

        availableRooms.add(111);
        availableRooms.add(222);
        availableRooms.add(333);
        availableRooms.add(444);
        availableRooms.add(555);
    }

    public void welcomePrompt() {
        System.out.println("Please enter your name here!");
        guestName = scanner.nextLine();
        System.out.println("Thank you, " + guestName + " for choosing Motel 6, would you like to book a room with us today? Please write YES or NO");
        String answer = scanner.nextLine().toLowerCase().trim();

        if (answer.equals("yes")) {
            System.out.println("Thank you, " + guestName + " you just booked a room with us today.");
            checkInRoom();
        } else {
            System.out.println("Sorry, " + guestName + " we hope you choose to come back another time!");
        }
    }

    public void checkInRoom() {
        System.out.println(guestName + ", you are now checked into room: " + availableRooms.get(0));

        unavailableRooms.add(availableRooms.get(0));
        availableRooms.remove(0);

        System.out.println("Enjoy your stay at the fab Motel 6~");

        displayAvailableRooms();
        displayUnavailableRooms();

        guestStatus();
    }

    public void guestStatus() {
        System.out.println("Hello, " + guestName + " are you ready to check out now? Write YES or NO");
        String answer = scanner.nextLine().toLowerCase().trim();

        if (answer.equals("yes")) {
            checkOutRoom();
        } else {
            System.out.println("Sure. We will check on your status later.");
            guestStatus();
        }
    }

    public void checkOutRoom() {
        System.out.println(guestName + ", you are now checking out of room: " + unavailableRooms.get(0));

        availableRooms.add(unavailableRooms.get(0));
        unavailableRooms.remove(0);

        System.out.println("Thank you, " + guestName + "! Please come back again soon!");

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
