package Chapter7;

import java.util.Scanner;

public class AverageAnArray {

    public static void main(String[] args) {

        double[] average = new double[10];

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter 10 double values: ");
        for (int index = 0; index < average.length; index++){
            average[index] = userInput.nextDouble();
        }

        System.out.println("Average is " + average(average));
    }


    public static int average(int[] array) {
        int average = 0;
        int total = 0;

        for (int j : array) {
            total += j;
            average = total / array.length;
        }
        return average;
    }

    public static double average(double[] array) {
        double average = 0.0;
        double total = 0.0;

        for (double v : array) {
            total += v;
            average = total / array.length;
        }

        return average;
    }
}
