/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.13 (Vowel or consonant?) Write a program that prompts the user to 
 * enter a letter and check whether the letter is a vowel or consonant. For 
 * nonletter input, display invalid input. Here is a sample run,
 * 
 *     Enter a letter: B
 *     B is a consonant
 *     
 *     Enter a letter: a
 *     a is a vowel
 *     
 *     Enter a letter: #
 *     # is an invalid input
 */
package exercise4_13;

import java.util.Scanner;

public class Exercise4_13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String s = input.next();
        
        char userInput = Character.toUpperCase(s.charAt(0));
        
        if (userInput < 'A' || userInput > 'Z')
            System.out.println(userInput + " is an invalid input.");
        else if (userInput == 'A' || userInput == 'E' || userInput == 'I' || 
                userInput == 'O' || userInput == 'U')
            System.out.println(userInput + " is a vowel.");
        else
            System.out.println(userInput + " is a consonant.");
    }
    
}
