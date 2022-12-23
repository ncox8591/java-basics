package exercise4_1;

// Import Scanner Class
import java.util.Scanner;

// Main Class
public class Exercise4_1 {
    
    // Main Method
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt and read user input for r (center to a vertex on pentagon
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        
        // Plug variable r into formula to find s (length of a side)
        double s = 2 * r * Math.sin((Math.PI / 5));
        
        // Plug s into the formula to find the area of a pentagon
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan((Math.PI / 5)));
        
        // Output the results
        System.out.printf("The area of the pentagon is %.2f\n", area);
        
    }
    
}
