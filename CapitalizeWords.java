/*
 * Question 4: Capitalize Words
 * Write a program that accepts a string as input, capitalizes the first letter of each word in the
 * string, and then returns the result string.
 */

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String inputString = sc.nextLine();
        
        String resultString = capitalizeWords(inputString);
        
        System.out.println("Input string : " + inputString);
        System.out.println("Result string : " + resultString);

        sc.close();
    }

    //Function to capitalize words
    public static String capitalizeWords(String str){
        if(str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s");

        for(String word: words) {
            if(!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        return result.toString().trim();
    }
}
