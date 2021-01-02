package com.timbuchalka;

import java.security.SecureRandom;

public class WorkingWithArrays {

    public static void main(String[] args) {

        double[] array = {1.2,3.4,1.1,54.1,0.5,32.1,0.1,11.4,64.1,5.5};

        double sum = 0;
        for (int i = 0; i < 2; i++){
            sum += array[i];
        }

        System.out.println("The sum of the first two elements of the array is: " + sum);

        double finalSum = 0;
        for (int i = 0; i < array.length - 1; i++){
            finalSum += array[i];
        }

        System.out.println("Final summation of all elements of the array is: " + finalSum);

        double minimumElement = array[0];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < minimumElement){
                minimumElement = array[i];
                index = i;
            }
        }
        System.out.printf("The minimum element of the array is: %.1f and the index is %d%n", minimumElement, index);

        SecureRandom newRand = new SecureRandom();
        int rand = newRand.nextInt(array.length - 1);

        double num = array[rand];
        System.out.printf("The randomly generated index is %d and the element is %.1f", rand, num);
    }
}
