import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of terms in Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the first two terms of the Fibonacci series
        int first = 0, second = 1;

        // Print the first two terms
        System.out.print("Fibonacci Series: " + first + " " + second);

        // Loop to calculate and print the next terms
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
