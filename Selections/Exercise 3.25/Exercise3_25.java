/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.25 (Geometry: intersecting point) Two points on line 1 are given 
 * as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4) as shown in 
 * figure 3.8a and b. The intersecting point of the two lines can be found by 
 * solving the following linear equations:
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * 
 * [Coder's algebra hint: Treat (y1 - y2) as a, (x1 - x2) as b, and e as 
 * ( a * x1 - b * y1) for the ax + by = e and cx + dy = f formula to then
 * solve for x = (ed - bf) / determinant and y = (af - ec) / determinant]
 * 
 * This linear equation can be solved using Cramer's rule (see Programming 
 * Exercise 3.3). If the equation has no solutions, the two lines are parallel. 
 * Write a program that prompts the user to enter four points and displays the 
 * intersecting point. Here are sample runs:
 *      
 * Enter x1, y1, x2, y2, x3, y3, x4, y4:
 * The intersecting point is at (2.88889, 1.1111)
 *  
 * Enter x1, y1, x2, y2, x3, y3, x4, y4:
 * The two lines are parallel. 
 */

package exercise3_25;

// Import Scanner class
import java.util.Scanner;

        // Main Class
public class Exercise3_25 {

        // Main Method
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user to input coordinates for two points for two lines
        System.out.print("Enter four (x, y) coordinates for four lines: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
       
        // Calculate variables for Cramer's rule
        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = a * x1 - b * y1;
        double f = c * x3 - d * y3;
        
        // Calculate determinant
        double determinant = a * d - b * c;
        
        // Output If determinant is 0, the lines are parallel
        if (determinant == 0) {
            System.out.println("The determinant is " + determinant + ". The "
                    + "equation has no solutions. The lines are parallel.");
        } else { // Else solve for x and y
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("The intersecting point is (" + x + ", " + y + ")");
        }
            
        
    }   // End Main Method 
    
}       // End Main Class
