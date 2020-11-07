package com.chelsea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hotel myBooking = new Hotel("", new ArrayList<>(), new ArrayList<>());
        CLI.runProgram(myBooking);
    }
}
