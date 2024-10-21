/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
6.2 (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
(Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 = 23).
Use a loop to repeatedly extract and remove the digit until all the digits are extracted. Write a test program
Due: Oct 27 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

public class Main { // Open the class block

    public static void main(String[] args) { // Open the main method block

        long number = 12678; // Declare and initialize the long variable named number

        int result = sumDigits(number); /* Use the number variable as an argument 
                                           when we call the sumDigits method */

        // Right here is where we print out the result of the sumDigits method
        System.out.println("Sum of digits in " + number + " is: " + result);

    } // Close the main method block



    // This is where we declare the sumDigits method
    public static int sumDigits(long n) { // Open the sumDigits method block

        // Declare and initialize the int variable named sum
        int sum = 0; // used as a place holder for the sum of the digits

        // Declare and initialize the int variable named digit
        int digit = 0; // used as a place holder for the extracted digit

        // Declare and initialize the int variable named count
        String digitString = ""; /* used as a place holder 
                                    for the string the user sees */

        // This while loop enables us to extract the digits from the number
        while (n > 0) { // we loop until the number we argued is less than 0

            // This is where we extract the digits from the number
            digit = (int) (n % 10); /* We used the hint here : Use the 
                                        % operator to extract digits */

            // This is where we add the extracted digit to the sum
            sum += digit;

            // This is where we append to a string to show the user the digits used
            digitString = digit + " " + digitString;

            n /= 10; /* We used the hint here : use the / operator to 
                        remove the extracted digit */
        }

        // Once we have a finalized string of all the digits print them here
        System.out.println("The digits are: " + digitString);

        // We end the method by returning the sum of the digits used in the argument
        return sum;

    } // Close the sumDigits method block

} // Close the class block