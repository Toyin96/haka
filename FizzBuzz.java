package Chapter6;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = scan.nextInt();

        System.out.println(checkerMethod(num));
    }


    public static String checkerMethod(int num) {

        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
          return String.valueOf(num);
    }
}
