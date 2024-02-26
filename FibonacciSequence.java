/*
 * Question 2: Fibonacci Sequence
 * Write a program to generate the Fibonacci sequence up to 100. 
 */

public class FibonacciSequence {
    public static void main(String[] args) {
        int limit = 100;
        generateFibonacciSequence(limit);
    }

    // Function to generate and output fibonacci sequence to a given limit
    public static void generateFibonacciSequence(int limit){
        int penultimate = 0, lastTerm = 1;

        System.out.println("Fibonacci Sequence up to " + limit + " :");
        System.out.print(penultimate + "\t" + lastTerm + "\t");

        while (true) {
            int nextTerm = penultimate + lastTerm;

            if(nextTerm > limit) {
                break;
            }

            System.out.print(nextTerm + "\t");

            penultimate = lastTerm;
            lastTerm = nextTerm;
        }

        System.out.println();
    }
}
