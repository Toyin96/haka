package com.timbuchalka;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipulatingArray {

    private static int numOfJss1StudentsEnrolled = 0;
    private static int numOfJss2StudentsEnrolled = 0;
    private static int numOfJss3StudentsEnrolled = 0;

    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello prospective student!...press 1 to continue or 2 to end program: ");
        int reply = scanner.nextByte();

        while (reply != 2) {

            System.out.print("Would you like to enrol to the Edmonton school?  Kindly enter 1 for YES or 2 for NO: ");
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.print("You've made the right choice! We can't wait to get you enrolled....but first kindly enter your name: ");
                String userInput1 = scanner.next();

                studentNames.add(userInput1);

                System.out.println("Now that your name has been sorted, what class you wish to be enrolled in?\n1. JSS 1\n2. JSS 2\n3. JSS 3 ");
                int input = scanner.nextInt();

                if (input == 1) {
                    ++numOfJss1StudentsEnrolled;
                } else {
                    if (input == 2) {
                        ++numOfJss2StudentsEnrolled;
                    } else {
                        ++numOfJss3StudentsEnrolled;
                    }
                }
                System.out.println("Here are the total num of students enrolled in \nJSS 1: " + numOfJss1StudentsEnrolled + "\nJSS 2: " + numOfJss2StudentsEnrolled + "\nJSS 3: " + numOfJss3StudentsEnrolled + "\nBelow is a list of the names of enrolled students for the year 2021/2022: " + "\n " + studentNames.toString());
            } else {
                System.out.println("Ouch...you're gonna regret this bro. Till we meet again...");
            }
        }
        System.out.println("Program has stopped...");
    }
}

