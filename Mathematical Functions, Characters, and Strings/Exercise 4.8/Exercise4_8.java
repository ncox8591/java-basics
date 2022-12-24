/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.8 (Find the character of an ASCII code) Write a program that 
 * receives an ASCII code (an integer between 0 and 127) and displays its 
 * character. Here is a sample run:
 * 
 *   Enter an ASCII code
 *   The character for ASCII code 69 is E 
 */

package exercise4_8;

import java.util.Scanner;

public class Exercise4_8 {

    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt and Read user input ASCII code integer
        System.out.print("Enter an ASCII code (an integer between 0 and 127): ");
        int asciiCode = input.nextInt();
        
        // Cast the asciiCode int to a character
        char character = (char)asciiCode;
        
        // Output resulting character
        System.out.println("That ASCII code's character is " + character);
            
    }
    
}
