/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.11 (Decimal to hex) Write a program that prompts the user to enter 
 * an integer between 0 and 15 and displays its corresponding hex number. For an 
 * incorrect input number, display invalid input. Here are some sample runs: 
 * 
 *     Enter a decimal value (0 to 15): 11
 *     The hex value is B
 *     
 *     Enter a decimal value (0 to 15): 5
 *     The hex value is 5
 *     
 *     Enter a decimal value (0 to 15): 31
 *     31 is an invalid input
 */
package exercise4_11;

import java.util.Scanner;

public class Exercise4_11 {

    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt and Read user input for a decimal value 0-15
        System.out.println("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();
        
        // Calculate and Output results
        // If decimalValue < 10 or > 15, input is invalid
        if (decimalValue < 0 || decimalValue > 15)
            System.out.println("Input invalid.");
        // Else if decimal value is between 0 and 10, 
        // the hex value is the decimal value
        else if (decimalValue < 10)
            System.out.println(decimalValue);
        else { // Else...
               // the char cast of decimalValue + 'A' - 10 is the hex value
            char ch = (char)(decimalValue + 'A' - 10);
            System.out.println(ch);
        } // End if-else statements
        
    }   
}
