/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.19 (Compute the perimeter of a triangle) Write a program that 
 * reads three edges for a triangle and computes the perimeter if the input is 
 * valid. Otherwise display that the input is invalid. The input is valid if the
 * sum of every pair of two edges is greater than the remaining edge.
 */
package exercise3_19;

// Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_19 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        //Compare the sums of all the sides
        if ((side1 + side2 > side3) && (side2 + side3 > side1) 
                                    && (side3 + side1 > side2)) {
            System.out.println(" The input is valid. The triangle's perimeter is: " 
                    + (side1 + side2 + side3));
        }            
        else
            System.out.println("The input is invalid.");
            
    } // End Main Method
    
} // End Main Class
