package com.timbuchalka;

public class FindingCommonElements {

    private static int[] list1 = {8,3,6,8,3,8,4,2,5};

    public static void main(String[] args) {

        System.out.println(secondSmallestElement(list1));

    }

    public static int secondSmallestElement(int[] list1) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] == smallest) {
                secondSmallest = smallest;
            }else
                if (list1[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = list1[i];
                }else {
                    if (list1[i] < secondSmallest) {
                        secondSmallest = list1[i];
                }
            }
        }
        return secondSmallest;
    }
}