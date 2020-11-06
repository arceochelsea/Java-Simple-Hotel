package com.chelsea;

import java.util.Scanner;

public class CLI {

    public static void runProgram(Hotel Motel6) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name here!");
        String guestName = scanner.nextLine();
        System.out.println("Thank you, " + guestName + " for choosing Motel 6, would you like to book a room with us today? Please write YES or NO");
        String answer = scanner.nextLine().toLowerCase().trim();

        if (answer.equals("yes")) {
            System.out.println("Thank you, " + guestName + " you just booked a room with us today.");
            Motel6.checkInRoom();
        } else {
            System.out.println("Sorry, " + guestName + " we hope you choose to come back another time!");
        }

        while (true) {
            System.out.println("Hello, " + guestName + " are you ready to check out now? Write YES or NO");
            answer = scanner.nextLine().toLowerCase().trim();
            if (answer.equals("yes")) {
                Motel6.checkOutRoom();
                break;
            } else {
                System.out.println("Sure. We will check on your status later.");
                continue;
            }
        }

    }


}
