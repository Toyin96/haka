package com.timbuchalka;

public class AmericanFlag {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 40; k++) {

                while (k <= 12) {
                    if ((i + k) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                }

                System.out.print("=");

            }
            System.out.println();
        }
        for (int l = 1; l <= 6; l++) {
            for (int p = 1; p <= 46; p++) {

                System.out.print("=");
            }

            System.out.println();
        }
    }
}