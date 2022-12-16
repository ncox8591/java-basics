/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 2 Elementary Programming
 * 
 * Exercise 2.15 (Geometry: distance of two points) Write a program that prompts 
 * the user to enter two points (x1, y1) and (x2, y2) and displays their 
 * distance. The formula for computing the distance is 
 * √((x2 - x1)^2 + (y2 - y1)^2). 
 * Note you can use Math.pow(a, 0.5) to compute √(a). Here is a sample run:
 *
 *   Enter x1 and y1: 1.5 -3.4
 *   Enter x2 and y2: 4    5
 *   The distance between the two points is 8.764131445842194
 */

package exercise2_15;

//Import Scanner class from java.util package
import java.util.Scanner;

//Main Class
public class Exercise2_15 {

    //Main Method
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        //Gather user input
        //Prompt user for x1 and y1
        System.out.println("Enter two points (x1 and y1): ");
        double x1 = input.nextDouble(); //read and assign input
        double y1 = input.nextDouble();
        
        //Prompt user for x2 and y2
        System.out.println("Enter two points (x2 and y2): ");
        double x2 = input.nextDouble(); //read and assign input
        double y2 = input.nextDouble();
        
// √((x2 - x1)^2 + (y2 - y1)^2). 
// Note you can use Math.pow(a, 0.5) to compute √(a). Here is a sample run:

        //Process calculation of distance between the points and assign to variable
        double distanceBetweenPoints = 
                Math.pow((Math.pow((x2 - x1), 2) 
                        + Math.pow((y2 - y1), 2)), 0.5);
        
        //Output results
        System.out.println("The distance between the two points is: " + 
                            distanceBetweenPoints);
    } //End Main Method
    
} //End Main Class
