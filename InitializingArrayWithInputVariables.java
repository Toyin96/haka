package com.timbuchalka;
import java.util.Scanner;

public class InitializingArrayWithInputVariables {

    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner scan = new Scanner(System.in); // userInput initializes array begins

        for (int i = 0; i < array.length; i++){
            System.out.printf("Enter a value to be stored in index %d %s of the array: ", i, "element");
            array[i] = scan.nextInt();
        }
        System.out.println();

        for (int a : array){
            System.out.printf("%d ", a);
        }   // userInput initializes array ends


        int sum = 0;           //array sum begins
        for (int k : array) {
            sum += k;
        }

        System.out.println();

            System.out.println("The sum of the array is: " + sum); //array sum ends

            int largestElement = 0;     //finding the largest array index and array element begins
            int largestIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > largestElement) {
                    largestElement = array[i];
                    largestIndex = i;
                }
            }

        System.out.printf("Index %d has the highest element of %d%n", largestIndex, largestElement);  //finding the largest array index and array element ends

        for (int i = array.length - 1; i > 0; i--){ // randomly shuffling array elements begin
            int j = (int) (Math.random() * (i + 1));

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int w : array){
            System.out.printf("%d ", w);
        }  // randomly shuffling array elements ends
        System.out.println(" <-- Randomly shuffling array elements");

    }
}
