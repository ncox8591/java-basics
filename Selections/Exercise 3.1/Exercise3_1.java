/* Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 3 Selections
 * 
 * Exercise 3.1 (Algebra: solve quadratic equations) The two roots of a 
 * quadratic equation can be obtained using the following formula:
 *           -b + √b^2 - 4ac           -b - √b^2 - 4ac
 *     r1 = ------------------   r2 = ------------------ 
 *                2a                         2a
 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is 
 * positive, the equation has two real roots. if it is zero, the equation has 
 * one root. If it is negative, the equation has no real roots.
 * 
 * Write a program that prompts the user to enter values for a, b, and c and 
 * displays the result based on the discriminant. If the discriminant is 
 * positive, display two roots. If the discriminant is 0, display one root. 
 * Otherwise display "The equation has no real roots."
 * 
 * Note you can use Math.pow(x, 0.5) to compute √x. Samples:
 * 
 *     Enter a, b, c: 1.0 3 1
 *     The equation has two roots -0.381966 and -2.61803
 *     
 *     Enter a, b, c: 1 2.0 1
 *     The equation has one root -1.0
 *     
 *     Enter a, b, c: 1 2 3
 *     The equation has no real roots
 * 
 */
package exercise3_1;

//Import the Scanner class from the java.util package
import java.util.Scanner;

// Main Class
public class Exercise3_1 {

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        //Prompt user for input
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        //Declare discriminant and root variables
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double r1;
        double r2;
        
        //If the discriminant is positive (greater than 0)
        if (discriminant > 0) {
            //calculate both roots
            r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            //output results
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
        //If the discriminant equals 0
        else if (discriminant == 0) {
            //calculate one root
            r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            //output results
            System.out.println("The equation has one root: " + r1);
        }
        //If the discriminant is negative (less than 0)
        else if (Math.pow(b, 2) - 4 * a * c < 0) {
            //output results
            System.out.println("The equation has no real roots.");            
        }
        
        
    } // End Main Method
    
} //End Main Class