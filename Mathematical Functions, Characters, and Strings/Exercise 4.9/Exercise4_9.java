/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.9 (Find the Unicode of a character) Write a program that receives 
 * a character and displays its Unicode. Here is a sample run:
 * 
 *     Enter a character: E
 *     The Unicode for the character E is 69
 */
package exercise4_9;

import java.util.Scanner;

public class Exercise4_9 {

    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt and Read user input for character as a String
        System.out.print("Enter a character: ");
        String s = input.next();
        
        // Use the character at s string's index 0
        char character = s.charAt(0);
        
        // Cast char to int
        int unicode = (int)character;
        
        // Output results
        System.out.println("The Unicode for '" + character + "' is " + unicode);
    }
    
}
