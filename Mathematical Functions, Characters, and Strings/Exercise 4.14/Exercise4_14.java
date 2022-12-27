/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.14 (Convert letter grade to number) Write a program that prompts 
 * the user to enter a letter grade A, B, C, D, or F and displays its 
 * corresponding numeric value 4, 3, 2, 1, or 0. For other input, display 
 * invalid grade. Here is a sample run,
 * 
 *     Enter a letter grade: B
 *     The numeric value for grade B is 3
 *     
 *     Enter a letter grade: T
 *     T is an invalid grade
 */
package exercise4_14;

import java.util.Scanner;

public class Exercise4_14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter grade: ");
        String s = input.next();
        char ch = Character.toUpperCase(s.charAt(0));
        
        if (ch < 'A' || ch == 'E' || ch > 'F')
            System.out.println(ch + " is an invalid grade.");
        else {
            System.out.print("The numeric value for grade " + ch + " is ");
            switch (ch) {
                case 'A': System.out.println("4"); break;
                case 'B': System.out.println("3"); break;
                case 'C': System.out.println("2"); break;
                case 'D': System.out.println("1"); break;
                case 'F': System.out.println("0");
            }
        }
        
    }
    
}
