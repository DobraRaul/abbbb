public class Main {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }

        // Check divisibility from 2 up to number - 1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // If no divisors found, the number is prime
    }

    public static void main(String[] args) {
        int count = 0;   // How many prime numbers we found
        int number = 2;  // Starting number

        System.out.println("First 8 prime numbers:");

        // Keep searching until we find 8 prime numbers
        while (count < 8) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++; // Increase how many primes we printed
            }
            number++; // Check the next number
        }
    }
}
