package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        int reset = numbers.length - 1;

        System.out.print("Enter any 10 integers: ");

        for (int i = 0; i < numbers.length; i++){
            numbers[reset - i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

    }
}
