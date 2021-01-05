package com.timbuchalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnalyzeScores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        int average = 0;
        int frequency1 = 0;
        int frequency2 = 0;

        ArrayList<Integer> number = new ArrayList<Integer>();

        while (1 > 0){
            System.out.print("Enter your score: ");
            int userNumbers = scan.nextInt();

            if (userNumbers < 0){
                break;
            }
            if (userNumbers <= 100) {
                number.add(userNumbers);
                total += userNumbers;
                average = total / (number.size());
            }

            if (userNumbers >= average){
                ++frequency1;
            }else{
                ++frequency2;
                }
            }
        System.out.print("\ntotal is " + total + "\nAverage is " + average + "\nNumber of scores equal to or above the average is " + frequency1 + "\nNumber of scores less than the average is " + frequency2);
    }
}
