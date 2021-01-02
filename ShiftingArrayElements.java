package com.timbuchalka;

public class ShiftingArrayElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int k : array) {
            System.out.printf("%d ", k);
        }

        System.out.println("These are the array elements");
        System.out.println();

        int t = array[0];   // Shifting elements by one to the left position begins
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        array[9] = t;

        for (int k : array) {
            System.out.printf("%d ", k);
        } //// Shifting elements by one to the left position ends

        System.out.println("<-- Shifting to left ");

        System.out.println();

        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int temp = array[9];   //// Shifting elements by one to the right position begins
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = temp;

        for (int k : array) {
            System.out.printf("%d ", k);
        }  // // Shifting elements by one to the right position begins

        System.out.println("Shifting to right --> ");
    }
}
