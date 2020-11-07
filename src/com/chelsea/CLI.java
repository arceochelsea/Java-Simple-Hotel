package com.chelsea;

import java.util.Scanner;

public class CLI {

    public static void runProgram(Hotel motel6) {
        //name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter your name here.");
        String guestName = scanner.nextLine();

        //booking
        System.out.println("Thank you, " + guestName + " for choosing Motel 6, would you like to book a room with us today? Please write YES or NO");
        String answer = scanner.nextLine().toLowerCase().trim();

        if (answer.equals("yes")) {
            System.out.println("Thank you, " + guestName + " you just booked a room with us today.");
            motel6.checkInRoom();
            motel6.guestStatus();
        } else {
            System.out.println("That's unfortunate " + guestName + ", we hope you choose to come back another time!");
        }
    }
}
