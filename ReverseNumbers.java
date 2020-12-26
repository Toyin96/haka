package com.timbuchalka;

public class ReverseNumbers {


    public int methodReverse(int number) {

        int revNum = 0;
        while (number > 0){
            int r = number % 10;
            revNum = revNum * 10 + r;
            number /= 10;
        }
        return revNum;
    }
}
