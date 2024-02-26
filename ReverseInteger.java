/*
 * Question 5: Reverse Integer
 * Write a program that takes an integer as input and returns an integer with reversed digit ordering.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInteger {
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
        
        System.out.println("Original integer : " + input);
        System.out.println("Reversed integer : " + reverseInteger(input));
        sc.close();
    }

    // Function to reverse an integer
    public static int reverseInteger(int num) {
        int digit;
        int reversed = 0;

        while (num != 0) {
            digit = num % 10; // Extract the number's last digit
            reversed = (reversed * 10) + digit; // Build reversed number by adding the digit
            num /= 10; // Remove the numbers last digit
        }

        return reversed;
    }
}
