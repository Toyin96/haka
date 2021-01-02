package com.timbuchalka;

public class ShufflingArray {

    public static void main(String[] args) {

        int [] myList = {1,3,46,7,9,7,54,2,1,156,77,23};

        for (int b : myList)
        System.out.printf("%d ", b);
        System.out.println();
        System.out.println();

        for (int i = myList.length - 1; i > 0; i--){
            int j = (int)(Math.random() * (i + 1));

            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

        for (int a : myList){
            System.out.printf("%d ", a);
        }

    }
}
