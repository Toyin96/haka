package com.timbuchalka;

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        int[] frequency = new int[7];

        for (int roll = 1; roll <= 6000000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        System.out.printf("%s%20s%n", "Number", "Frequency");

        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%20d%n", face, frequency[face]);

    }
}
