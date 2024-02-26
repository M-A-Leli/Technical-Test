/*
 * Question 3: Power of Two
 * Write a program that takes an integer as input and returns true if the input is a power of two.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        // Allow only integer input. Otherwise, loop.
        while (true) {
            try {
                System.out.print("Enter an interger : ");
                input = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please! ");
                sc.nextLine();
            }
        }
        
        System.out.println("Is " + input + " a power of two? : " + isPowerOfTwo(input));
        sc.close();
    }

    // Function to determine if a number is a power of 2
    public static boolean isPowerOfTwo(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) ? true :false;
    }
}
