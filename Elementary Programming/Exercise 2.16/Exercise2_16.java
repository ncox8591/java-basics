/* Intro to Java Programming and Data Structures by Y. Daniel Liang
Chapter 2 Elementary Programming

 * Exercise 2.16 (Geometry: area of a hexagon) Write a program that prompts the
 * user to enter the side of a hexagon and displays its area. The formula for 
 * computing the area of a hexagon is:
 *
 *            3 √(3)
 *   Area = ---------- (s^2)
 *              2
 *
 */

package exercise2_16;

//Import Scanner class
import java.util.Scanner;

//Main Class
public class Exercise2_16 {

    //Main Method
    public static void main(String[] args) {
        //Create Scanner object for gathering input
        Scanner input = new Scanner(System.in);
        
        // Input
        // Prompt user for input, then read and assign input to variables
        System.out.println("Enter side of a hexagon: ");
        double sideOfHexagon = input.nextDouble();
        
        // Process
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(sideOfHexagon, 2);
        
        // Output
        System.out.println("The area of the hexagon is: " + area);
    } // End Main Method
    
} // End Main Class
