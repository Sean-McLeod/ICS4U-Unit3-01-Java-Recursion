/*
* This program uses recursion
* to reverse a string.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-05
*/

import java.util.Scanner;


final class Recursion {
    private Recursion() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static String reverse(final String stringToReverse,
                                 final int stringLength) {
        // This function reverses a string
        if (stringLength == 0) {
            return stringToReverse.charAt(0) + "";
        } else {
            char singleChar = stringToReverse.charAt(stringLength);
            // return characters one by one
            return singleChar + reverse(stringToReverse, stringLength - 1);
        }
    }


    public static void main(final String[] args) {
        // input
        Scanner userString = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");

        String stringToReverse = userString.nextLine();

        // pass & accept parameters
        String reversedString = reverse(stringToReverse,
                                        stringToReverse.length() - 1);
        // output
        System.out.println("\nreversed string: " + reversedString);
    }
}
