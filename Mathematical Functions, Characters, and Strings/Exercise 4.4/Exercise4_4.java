/*Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.4 (Geometry: area of a hexagon) The area of a hexagon can be 
 * computed using the following formula (s is the length of a side):
 * 
 *                  6 x s²
 *     Area = ------------------
 *               4 x tan(π/6)
 * Write a program that prompts the user to enter the side of a hexagon and 
 * displays its area. Here is a sample run:
 * 
 *     Enter the side: 5.5
 *     The area of the hexagon is 78.59 6 * s^2 / (4 * tan(pi/6))
 * 
 */
package exercise4_4;

import java.util.Scanner;

public class Exercise4_4 {

    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt and read user input for length of a hexagon side
        System.out.print("Enter the length of a hexagon's side: ");
        double s = input.nextDouble();
        
        // Calculate hexagon area with formula 6 * s^2 / (4 * tan(pi/6))
        double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));
        
        // Output the results
        System.out.printf("The area of the hexagon is %.2f\n", area);
        
    }
    
}
