/* Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.2 (Geometry: great circle distance) The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:
 * 
 * d = radius x arccos(sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1 - y2))
 * Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance. The average radius of the earth is 6,371.01 km. Note you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees. Here is a sample run,
 * 
 * Enter point 1 (latitude and longitude) in degrees: 39.55 -116.25
 * Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
 * The distance between the two points is 10691.79183231593
 */

package exercise4_2;

// Import Scanner Class
import java.util.Scanner;

// Main Class
public class Exercise4_2 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Prompt & read user input for longitude/latitude degrees for 2 points
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // Initialize constant variable for radius
        final double RADIUS = 6371.01;
        
        // Calculate distance
        double d = RADIUS * Math.acos((Math.sin(Math.toRadians(x1)))
                 * Math.sin(Math.toRadians(x2))    // Convert degrees to radians
                 + Math.cos(Math.toRadians(x1))    // throughout distance
                 * Math.cos(Math.toRadians(x2))    // formula.
                 * Math.cos((Math.toRadians(y1) 
                          - Math.toRadians(y2))));
        
        // Output result of distance
        System.out.println("The distance between the two points is: " + d 
                           + " km");
    } // End Main Method
    
} // End Main Class
