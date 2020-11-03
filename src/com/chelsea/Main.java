package com.chelsea;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hotel myBooking = new Hotel("Chelsea", new int[]{101});
        System.out.println(myBooking.toString());
        myBooking.displayAvailableRooms();
//        Hotel myBooking = new Hotel("chelsea", 102, 103, 104);
//        System.out.println(myBooking.availableRooms);

    }
}
