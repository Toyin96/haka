package com.timbuchalka;

import java.util.Scanner;

public class TestingArray {

    public static void main(String[] args) {
        
        int[] array = {2,5,7,9,44,2,5,7,78,44,8,76,22};
        System.out.printf("%s%8s%15s%n", "ArrayIndex", "Value", "BarChart");

        for (int counter = 0; counter < array.length; counter++){

            System.out.printf("%3d%13d%9s", counter, array[counter], "");

            for (int t = 0; t < array[counter]; t++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
