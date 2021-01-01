package com.timbuchalka;

import java.security.SecureRandom;

public class StudentArray {

    public static void main(String[] args) {

        /*
Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
in an integer array and determine the frequency of each rating.
         */

        int[] students = new int[20];
        SecureRandom rand = new SecureRandom();

        for (int counter = 0; counter <= 19; counter++){
            ++students[rand.nextInt(6)];
        }

        System.out.printf("%s%15s%n", "STUDENTS", "RESPONSES");

       for (int face = 0; face < students.length; face++) {
           System.out.printf("%3d%16d%n", face, students[face]);
       }


    }
}
