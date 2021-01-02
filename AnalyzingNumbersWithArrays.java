package com.timbuchalka;

public class AnalyzingNumbersWithArrays {

    public static void main(String[] args) {
        double[] r = new double[100];

        for (int i = 0; i < r.length - 1; i++)
            r[i] = Math.random() * 100;

        for (double a : r){
            System.out.printf("%.1f  ",a);
        }
        double sum = 0;
        double average = 0;
        int frequency = 0;
        for (double v : r) {
            sum += v;
            average = sum / 100;

            if (v > average) {
                ++frequency;
            }
        }
        System.out.printf("%n%nThe sum of all elements is %.2f%nWhile the average is %.2f%nWhile the number of the items greater than the average are %d%n", sum, average, frequency);
    }
}
