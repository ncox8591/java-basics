/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.6 (Random points on a circle) Write a program that generates three 
 * random points on a circle centered at (0, 0) with radius 40 and displays 
 * three angles in a triangle formed by these three points, as shown in 
 * Figure 4.4a (*Hint*: Generate a random angle α in radians between 0 and 2π, 
 * as shown in Figure 4.4b and the point determined by this angle is 
 * (rˣcos(α), rˣsin(α)).)
 */
package exercise4_6;

public class Exercise4_6 {

    public static void main(String[] args) {
        // Generate three random angles between 0 and 2π
        double angle1 = (Math.random() * (2 * Math.PI));
        double angle2 = (Math.random() * (2 * Math.PI));
        double angle3 = (Math.random() * (2 * Math.PI));
        
        final double RADIUS = 40.0;
        
        // Generate three points with the random angles
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);
        
        // Calculate length of triangle's sides with distance formula
        double sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double sideB = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double sideC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        
        // Calculate triangle's angles in degrees
        // A = arccos(b^2 + c^2 - a^2/ (2bc)) B = arccos(a^2 + c^2 - b^2/(2ac))
        // C = arccos(a^2 + b^2 - c^2/ (2ab))
        double angleA = Math.toDegrees(Math.acos((Math.pow(sideB, 2) 
                + Math.pow(sideC, 2) - Math.pow(sideA, 2)) 
                / (2 * sideB * sideC)));
        double angleB = Math.toDegrees(Math.acos((Math.pow(sideA, 2) 
                + Math.pow(sideC, 2) - Math.pow(sideB, 2)) 
                / (2 * sideA * sideC)));
        double angleC = Math.toDegrees(Math.acos((Math.pow(sideA, 2) 
                + Math.pow(sideB, 2) - Math.pow(sideC, 2)) 
                / (2 * sideA * sideB)));
        
        // Format and Output results
        System.out.printf("%10s%10s%10s\n%10.2f%10.2f%10.2f\n", 
                "Angle A", "Angle B", "Angle C", angleA, angleB, angleC);
    }
    
}
