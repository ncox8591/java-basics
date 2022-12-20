/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.22 (Geometry: point in a circle?) Write a program that prompts 
 * the user to enter a point (x, y) and checks whether the point is within the
 * circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the
 * circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
 * (Hint: A point is in a circle if its distance to (0, 0) is less than or 
 * equal to 10. The formula for computing the distance is 
 * √((x2 - x1)^2 + (y2 - y1)^2). Test your program to cover all cases.) 
 * Two sample runs are shown below:
 * 
 *     Enter a point with two coordinates: 4 5
 *     Point (4.0, 5.0) is in the circle
 *     
 *     Enter a point with two coordinates: 9 9
 *     Point (9.0, 9.0) is not in the circle
 */
package exercise3_22;

//Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_22 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a point's coordinates and read input for x1 x2
        System.out.println("Enter a point's coordinates (x y): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        // Assign coordinate's of circle's center to variables x2 y2
        double x2 = 0;
        double y2 = 0;
        
        // Calculate distance between the two points √((x2 - x1)^2 + (y2 - y1)^2)
        double distanceBetweenPoints = Math.pow(((Math.pow((x2 - x1), 2)) 
                                     + (Math.pow((y2 - y1), 2))), 0.5);

        // Display results of distance calculation
        System.out.println("The distance between (0,0) and (" 
                          + x1 + ", " + y1 + ") is: " + distanceBetweenPoints);
        
        // If the results are less than or equal to 10, output
        if (distanceBetweenPoints <= 10)
            System.out.println("The point is within the circle.");
        else // If the results don't meet the <= 10 criteria, output
            System.out.println("The point is not in the circle.");
                    
    } // End Main Method
    
} // End Main Class