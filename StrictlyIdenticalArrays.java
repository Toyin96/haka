package Chapter7;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class StrictlyIdenticalArrays {

    int[] list1;
    int[] list2;


    public int[] initializeFirstArrayWith(String userInput) {
        String[] doubtingThomas = userInput.split(" ");
        if(doubtingThomas.length<2){
            doubtingThomas = userInput.split(",");
        }
        list1 = new int[doubtingThomas.length];
        int counter = 0;
        for(String number: doubtingThomas){
            list1[counter++] = Integer.parseInt(number);
        }
        return list1;
    }
    public int[] initializeSecondArrayWith(String userInput2) {
        String[] forUserInput2 = userInput2.split(" ");
        if (forUserInput2.length < 2) {
            forUserInput2 = userInput2.split(",");
        }

        list2 = new int[forUserInput2.length];
        int count = 0;
        for (String num : forUserInput2) {
            list2[count++] = Integer.parseInt(num);
        }
        return list2;
    }

    public String collectInput(){
        String inputCollected ="";
        String result = JOptionPane.showInputDialog("Enter all numbers separated with space or comma: ");
          inputCollected = result;

        return inputCollected;
    }

    public boolean compareArray(int[] array1, int[] array2) {

        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

