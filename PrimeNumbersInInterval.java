/**
 * PrimeNumbersInInterval.java
 *
 * This program calculates how many prime numbers exist
 * between two given positive integers (>=2 and <=20000).
 *
 * Input: two integers (start and end of interval).
 * Output: number of prime numbers in the interval.
 *
 * Example:
 * Input: 10 20
 * Output: 4
 */

import java.util.Scanner;

public class PrimeNumbersInInterval {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        // Only check divisors up to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.println("Enter two integers between 2 and 20000:");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Validate input
        if (start < 2 || end > 20000 || start > end) {
            System.out.println("Invalid input. Please enter values between 2 and 20000, with start <= end.");
            return;
        }

        // Count prime numbers in interval
        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        // Print result
        System.out.println("Number of prime numbers in interval: " + primeCount);
    }
}
