package com.chelsea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel myBooking = new Hotel(scanner,"", new ArrayList<>(), new ArrayList<>());
        myBooking.welcomePrompt();
    }
}
