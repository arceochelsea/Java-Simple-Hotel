package com.chelsea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel myBooking = new Hotel(scanner,"Chelsea", new ArrayList<>(), new ArrayList<>());
       // myBooking.displayAvailableRooms();
        myBooking.welcomePrompt();
        myBooking.displayAvailableRooms();
        myBooking.displayUnavailableRooms();
    }
}
