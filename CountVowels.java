/* 
 * Question 6: Count Vowels
 * Write a program that counts the number of vowels in a sentence.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = sc.nextLine();
        
        int numOfVowels = countVowels(input);
        
        System.out.println("Number of vowels : " + numOfVowels);

        sc.close();
    }

    // Function to count vowels, non-repeating.
    public static int countVowels(String str) {
        Set<Character> vowels = new HashSet<>();

        for(Character ch : str.toLowerCase().toCharArray()) {
            if(isVowel(ch)) {
                vowels.add(ch);
            }
        }

        return vowels.size();
    }

    // Function to match lowercase vowels using regex
    public static boolean isVowel(Character ch) {
        String regex ="^[aeiou]$";
        return Pattern.matches(regex, String.valueOf(ch));
    }
}
