
// The line `import java.util.Scanner;` is importing the `Scanner` class from the `java.util` package.
// The `Scanner` class is used to read input from the user in Java. By importing this class, we can
// create an instance of `Scanner` and use its methods to read input from the user.
import java.util.Scanner;

/**
 * The Prime_no class is used to determine whether a given number is prime or
 * not.
 */

public class Prime_no {

    // The code `public static void main(String[] args)` is the main method in Java.
    // It is the entry
    // point of the program and is executed when the program is run.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This code is prompting the user to enter the starting number of a range and
        // then reading the
        // input from the user using the `nextInt()` method of the `Scanner` class. The
        // entered number is
        // then stored in the variable `start`.
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        // This code is prompting the user to enter the ending number of a range and
        // then reading the
        // input from the user using the `nextInt()` method of the `Scanner` class. The
        // entered number
        // is then stored in the variable `end`.
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        // The code `System.out.println("Prime numbers in the range " + start + " to " +
        // end + ":");` is
        // printing a message to the console. The message is "Prime numbers in the
        // range" followed by
        // the values of the variables `start` and `end`.
        System.out.println("Prime numbers in the range " + start + " to " + end + ":");
        PrimesInRange(start, end);

        // The line `scanner.close();` is closing the `Scanner` object. This is done to
        // release any system
        // resources associated with the `Scanner` object and to prevent any potential
        // resource leaks. It is
        // good practice to close the `Scanner` object when it is no longer needed.
        scanner.close();
    }

    // The `printPrimesInRange` method is a helper method that takes in two
    // parameters, `start` and
    // `end`, which represent the starting and ending numbers of a range.
    private static void PrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // The code `System.out.println();` is used to print a new line to the console.
        // It is used in
        // this program to print a blank line after printing all the prime numbers in
        // the given range.
        System.out.println();
    }

    // The `isPrime` method is a helper method that takes in an integer `num` as a
    // parameter and
    // returns a boolean value.
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // The code `for (int i = 2; i <= Math.sqrt(num); i++)` is a for loop that
        // iterates from 2 to
        // the square root of the given number `num`.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        // The line `return true;` is used to indicate that the given number is prime.
        // It is reached
        // when the for loop in the `isPrime` method does not find any factors of the
        // number `num`. In
        // other words, if the number `num` is not divisible by any number from 2 to the
        // square root of
        // `num`, then it is considered prime and the method returns `true`.
        return true;
    }
}
