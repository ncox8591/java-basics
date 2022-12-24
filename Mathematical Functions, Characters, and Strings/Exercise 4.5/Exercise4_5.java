/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.5 (Geometry: area of a regular polygon) A regular polygon is an 
 * n-sided polygon in which all sides are the same length and all angles have 
 * the same degree (i.e., the polygon is both equilateral and equiangular). The 
 * formula for computing the area of a regular polygon is
 * 
 *                n x s²
 *     Area = -----------------
 *              4 x tan(π/n)
 * double area = n * Math.POW(s, 2) / (4 * Math.tan(Math.PI / n));
 * Here, s is the length of a side. Write a program that prompts the user to 
 * enter the number of sides and their length of a regular polygon and displays 
 * its area. Here is a sample run:
 * 
 *     Enter the number of sides: 5
 *     Enter the side: 6.5
 *     The area of the polygon is 72.69017017488385
 */
package exercise4_5;

import java.util.Scanner;

public class Exercise4_5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Get user input for variable n (number of sides)
        System.out.print("Enter the polygon's number of sides: ");
        int n = input.nextInt();
        
        // Get user input for variable s (length of sides)
        System.out.print("Enter the length of a side: ");
        double s = input.nextDouble();
        
        // Calculate area of regular polygon
        double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
        
        // Output results
        System.out.println("The area of the polygon is: " + area);
    }
    
}
