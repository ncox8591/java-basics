/* Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 3 Selections
 * 
 * Exercise 3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome intger. An Integer is palindrome if it reads the same from right to left and from left to right. A negative integer tis treated the same as a positive integer. Here are sample runes of this program:
 * 
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * 
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 */

package exercise3_12;

// Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_12 {

    // Main Method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter a three digit number: ");
        int userNumber = input.nextInt();
        
        // Convert potential negative number to positive
        if (userNumber < 0)
            userNumber *= -1;
        
        //Get digits from user number
        int d3 = userNumber % 10;       //last digit
        int d1 = userNumber / 100 % 10; //first digit
        
        // If the first and last digit are equivalent, print palindrome 
        if (d3 == d1) {
            System.out.println(userNumber + " is a palindrome.");
        } // Otherwise, print Not Palindrome
        else 
            System.out.println(userNumber + " is not a palindrome.");
    } //End Main Method
    
} // End Main Class
