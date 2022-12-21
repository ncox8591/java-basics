/*Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 3 Selections
 * 
 * Exercise 3.26 (Use the &&, ||, and ^ operators) Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6 but not both. Here is a sample run of this program:
 * 
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 */

package exercise3_26;

// Import Scanner Class
import java.util.Scanner;

// Main Class
public class Exercise3_26 {

    // Main Method
    public static void main(String[] args) {
        
        // Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for integer input
        System.out.print("Enter an integer: ");
        int userInteger = input.nextInt();
        
        boolean divisibleByBoth = false;
        boolean divisibleByOne = false;
        boolean divisibleByOnlyOne = false;
        
        if (userInteger % 5 == 0 && userInteger % 6 == 0)
                divisibleByBoth = true;
        if (userInteger % 5 == 0 || userInteger % 6 == 0)
            divisibleByOne = true;
        if (userInteger % 5 == 0 ^ userInteger % 6 == 0)
            divisibleByOnlyOne = true;
        
        System.out.println("Is 10 divisible by 5 and 6? " + divisibleByBoth + 
                          "\nIs 10 divisible by 5 or 6? " + divisibleByOne + 
            "\nIs 10 divisible by 5 or 6, but not both? " + divisibleByOnlyOne);
    } // End Main Method
    
} // End Main Class
