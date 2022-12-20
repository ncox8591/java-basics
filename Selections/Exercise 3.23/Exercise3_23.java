/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.23 (Geometry: point in a rectangle) Write a program that prompts 
 * the user to enter a point (x, y) and checks whether the point is within the 
 * rectangle centered at (0, 0) with width 10 and height 5. For example, (2, 2) 
 * is inside the rectangle and (6, 4) is outside the rectangle, as shown in 
 * Figure 3.7b. (*Hint*: A point is in the rectangle if its horizontal distance
 * to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0)
 * is less than or equal to 5.0 / 2. Test your program to cover all cases.) 
 * Here are two sample runs:
 * 
 *     Enter a point with two coordinates: 2 2
 *     Point (2.0, 2.0) is in the rectangle
 *     
 *     Enter a point with two coordinates: 6 4
 *     Point (6.0, 4.0) is not in the rectangle
 */

package exercise3_23;

// Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_23 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for point coordinates and read input to point's x y variables
        System.out.println("Enter a point with two coordinates (x y): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        double rectangleCenterX = 0;
        double rectangleCenterY = 0;
        double rectangleWidth = 10.0;
        double rectangleHeight = 5.0;
        
        // Calculate horizontal distance between rectangle center and x1 input
        double horizontalDistanceBetweenPoints = x1 - rectangleCenterX;
        
        // Calculate vertical distance between rectangle center and y1 input
        double verticalDistanceBetweenPoints = y1 - rectangleCenterY;
        
        // Out horizontal and vertical distance calculation results
        System.out.println("The vertical distance between points (0, 0) and (" + x1 + ", " 
                          + y1 + ") is: " + verticalDistanceBetweenPoints);
        System.out.println("The horizontal distance is " + horizontalDistanceBetweenPoints);
        
        // Conditional outputs: point is within rectangle if vertical distance <= rectangle height / 2
        // AND if horizontal distance <= rectangle width / 2
        if ((verticalDistanceBetweenPoints <= (rectangleHeight / 2)) && (horizontalDistanceBetweenPoints <= (rectangleWidth / 2))) {
            System.out.println("The point is within the rectangle.");
        }
        // Else point is not within rectangle
        else
            System.out.println("The point is not within the rectangle.");
        
    } // End Main Method
    
} // End Main Class
