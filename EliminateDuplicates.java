package Chapter7;

import com.timbuchalka.SearchArray;
import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates extends SearchArray {

    private static int[] listArray = new int[5];

    public static void main(String[] args) {
        numberCollector();


    }

    public static void numberCollector() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter an integer: ");
            int number = scan.nextInt();

            if (!linearSearch(listArray, number)) {
                listArray[i] = number;
            }
            System.out.println(Arrays.toString(listArray));
        }
    }
}



